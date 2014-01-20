package com.example.obscrianca1;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by carlos on 16-01-2014.
 */
public class ObservationDAO {

    private Context ctx;
    private String table_name = "Observation";
    private String[] colunas = new String[] { "cidade", "cnome", "csexo","observador","escola","nes" };

    public ObservationDAO(Context ctx){
        this.ctx = ctx;
    }

    public boolean insert(ObservationVO observation){
        SQLiteDatabase db = new DBHelper(ctx).getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("cidade", observation.getCIdade());
        values.put("cnome", observation.getCNome());
        values.put("csexo", observation.getCSexo());
        values.put("observador", observation.getObservador());
        values.put("escola", observation.getEscola());
        values.put("nes", observation.getNes());
        return (db.insert(table_name, null, values) > 0);
    }

}
