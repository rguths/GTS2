package com.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public  static int VERSION = 1;
    public static String NOME_DB = "DB_GTS";
    public DBHelper(@Nullable Context context) {

        super(context, NOME_DB, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql_revenda = "CREATE TABLE IF NOT EXISTS revenda (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nome VARCHAR(30), SITUACAO_DB INT));";
            //situacao = 0 registro apenas no local (SQLite)
            //situacao = 1 registro  no local (SQLite) e também no MongoDB
            //situacao = 2 registro  apenas no MongoDB
        String sql_venda = "CREATE TABLE IF NOT EXISTS venda (id INTEGER  PRIMARY KEY AUTOINCREMENT, " +
                "nome VARCHAR(50) NOT NULL, pedido int,  data datetime, uf varchar(2), revenda VARCHAR(30), " +
                "modelo VARCHAR(10), valor INT, entrega date, percentual float, comissao INT, " +
                "sinal INT, parcela1 INT, parcela1_data VARCHAR(30), parcela2 INT, parcela2_data VARCHAR(30), " +
                "parcela3 INT, parcela3_data VARCHAR(30), valorRecebido INT ," +
                "comentarios VARCHAR(30), SITUACAO_DB INT);";
            //situacao = 0 registro apenas no local (SQLite)
            //situacao = 1 registro  no local (SQLite) e também no MongoDB
            //situacao = 2 registro  apenas no MongoDB

        try {
            db.execSQL(sql_revenda);
            db.execSQL(sql_venda);
            Toast.makeText( null, "Sucesso em criar DB.", Toast.LENGTH_LONG).show();
        } catch ( Exception e){
            Toast.makeText( null, "Erro em criar DB.", Toast.LENGTH_LONG).show();
        };
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
