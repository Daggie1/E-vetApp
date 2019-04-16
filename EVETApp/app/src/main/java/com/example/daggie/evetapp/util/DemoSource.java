package com.example.daggie.evetapp.util;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lirfu on 25.06.17..
 */

public class DemoSource implements Source {
    private ArrayList<DataEntry> entries;

    public DemoSource() {
        entries = new ArrayList<>();

        entries.add(new DataEntry("Foot and Mouth", "Cows", "fever"));
        entries.add(new DataEntry("you", "suncano", "toplo of the rest","old","new","good"));
        entries.add(new DataEntry("DA", "oblacno", "toplo"));
        entries.add(new DataEntry("NE", "suncano", "vruce"));
        entries.add(new DataEntry("NE", "oblacno", "hladno of the rest"));
        entries.add(new DataEntry("NE", "kisa", "hladno"));
        entries.add(new DataEntry("DA", "suncano", "vruce"));
        entries.add(new DataEntry("ye", "suncano", "toplo"));
        entries.add(new DataEntry("NE", "kisa", "toplo"));

        entries.add(new DataEntry("Bsure","the real suncano", "toplo of the rest","mine too"));
        entries.add(new DataEntry("Worked","the real suncano", "toplo of the rest","mine too"));
        entries.add(new DataEntry("DA", "oblacno", "vruce"));
    }

    @Override
    public List<DataEntry> loadEntries(Context context) {
        return entries;
    }

    @Override
    public void storeEntries(Context context, List<DataEntry> entries) {
        this.entries = new ArrayList<>(entries);
    }
}
