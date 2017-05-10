package com.example.ploy.derplist.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ploy on 5/10/17.
 */

public class DerpData {
    private static final String[] title={"Nothing cannot be def inned","The shortes thing cannot be snapped"
    ,"be like brother,my friend"};
    private static final  int[] icons={android.R.drawable.ic_popup_reminder,android.R.drawable.ic_menu_add,
    android.R.drawable.ic_menu_delete};

    public static List<ListItem>getListData(){
        List<ListItem>data=new ArrayList<>();

        for (int x=0;x<4;x++){
            for (int i=0;i<title.length && i<icons.length;i++){
                ListItem item=new ListItem();
                item.setImageResid(icons[i]);
                item.setTitle(title[i]);
                data.add(item);
            }
        }
        return data;
    }
}
