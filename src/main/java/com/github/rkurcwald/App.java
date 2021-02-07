package com.github.rkurcwald;

import java.util.Random;

public class App 
{
    static Village[] villageObjects = new Village[5000];
    static Random rand=new Random();
    static Object[][] worldMap=new Object[50][50];//[700][700]
    public static void main( String[] args )
    {

        for(int i=0;i< worldMap.length;i++)
        {
            for(int j=0;j< worldMap.length;j++)
            {
                worldMap[i][j]=" ";
            }
        }

       for(int i=0;i<villageObjects.length;i++)
       {
    //       villageObjects[i]= new Village(rand.nextInt(400)+300,rand.nextInt(400)+300,"demonicviper","WM", rand.nextInt(12000));
           villageObjects[i]= new Village(rand.nextInt(40)+5,rand.nextInt(40)+5,"demonicviper","WM", rand.nextInt(12000));

           worldMap[villageObjects[i].returnX()][villageObjects[i].returnY()]="X";
       }
       for(int i=0;i< villageObjects.length;i++)
       {
           //System.out.format("Village: %d%n",i+"] "+villageObjects[i].returnData());
           System.out.println("Village "+i+"] "+villageObjects[i].returnData()[0]+","+villageObjects[i].returnData()[1]+","+villageObjects[i].returnData()[2]+","+villageObjects[i].returnData()[3]);
       }

       for(int i=0;i< worldMap.length;i++)
       {
           for(int j=0;j< worldMap.length;j++)
           {
                System.out.print(worldMap[i][j]);
           }
           System.out.println();
       }
    }
}
