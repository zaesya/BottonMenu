package com.example.bottonmenuexample;

public class item {
    private int imageBangun;
    private String NamaBangunn;

    public String getDescBangunn() {
        return DescBangunn;
    }

    private String DescBangunn;


    public item(int imageBangun, String namaBangunn, String descBangunn) {
        this.imageBangun = imageBangun;
        NamaBangunn = namaBangunn;
        DescBangunn = descBangunn;
    }



    public int getImageBangun() { return imageBangun;
    }

    public String getNamaBangunn() {
        return NamaBangunn;
    }
}
