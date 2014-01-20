package com.example.obscrianca1;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by carlos on 17-01-2014.
 */
public class SessionDAO {

    private Context ctx;
    private String table_name = "Session";
    private String[] colunas = new String[] { "data", "experienciasdeaprendizagem", "grupo","interacao","ntotaladultos","ncriancas","niveldeenvolvimento","ntotaldecriancas","niveldeiniciativa" };

    public SessionDAO(Context ctx){
        this.ctx = ctx;
    }

    public boolean insert(SessionVO session){
        SQLiteDatabase db = new DBHelper(ctx).getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("data", session.getData());
        values.put("experienciasdeaprendizagem", session.getExperienciasdeaprendizagem());
        values.put("grupo", session.getGrupo());
        values.put("interacao", session.getInteracao());
        values.put("ntotaladultos", session.getNtotaladultos());
        values.put("ncriancas", session.getNcriancas());
        values.put("niveldeenvolvimento", session.getNiveldeenvolvimento());
        values.put("ntotaldecriancas", session.getNtotaldecriancas());
        values.put("niveldeiniciativa", session.getNiveldeiniciativa());
        return (db.insert(table_name, null, values) > 0);
    }

}
