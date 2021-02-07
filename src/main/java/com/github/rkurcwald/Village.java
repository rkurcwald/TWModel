package com.github.rkurcwald;

import java.util.List;

public class Village {
    private int cordX;
    private int cordY;
    private int points;
    private String owner;
    private String tribe;

    public Village(int cordX,int cordY,String owner,String tribe,int points)
    {
        this.cordX=cordX;
        this.cordY=cordY;
        this.owner=owner;
        this.tribe=tribe;
        this.points=points;
    }

    public String returnCords() //Concat X|Y
    {
        return cordX+"|"+cordY;
    }
    public int returnX()
    {
        return cordX;
    }
    public int returnY()
    {
        return cordY;
    }
    public String[] returnData()
    {
        return new String[]{returnCords(),owner,tribe, String.valueOf(points)};
    }



}
