// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

//mobile -super_
public class Entity extends Animable {

    public final void setPos(int x, int y, boolean flag)//push
    {
        if(animation != -1 && Animation.anims[animation].priority == 1)
            animation = -1;
        if(!flag)
        {
            int dx = x - path_x[0];
            int dy = y - path_y[0];
            if(dx >= -8 && dx <= 8 && dy >= -8 && dy <= 8)
            {
                if(path_length < 9)
                    path_length++;
                for(int i1 = path_length; i1 > 0; i1--)
                {
                    path_x[i1] = path_x[i1 - 1];
                    path_y[i1] = path_y[i1 - 1];
                    path_run[i1] = path_run[i1 - 1];
                }

                path_x[0] = x;
                path_y[0] = y;
                path_run[0] = false;
                return;
            }
        }
        path_length = 0;
        anInt1542 = 0;
        anInt1503 = 0;
        path_x[0] = x;
        path_y[0] = y;
        this.bound_extent_x = path_x[0] * 128 + bound_dim * 64;
        this.bound_extent_y = path_y[0] * 128 + bound_dim * 64;
    }

    public final void method446()
    {
        path_length = 0;
        anInt1542 = 0;
    }

    public final void updateHitData(int j, int k, int l)
    {
        for(int i1 = 0; i1 < 4; i1++)
            if(hitsLoopCycle[i1] <= l)
            {
                hitArray[i1] = k;
                hitMarkTypes[i1] = j;
                hitsLoopCycle[i1] = l + 70;
                return;
            }
    }

    public final void move(boolean run, int dir)
    {
        int x = path_x[0];
        int y = path_y[0];
        if(dir == 0)
        {
            x--;
            y++;
        }
        if(dir == 1)
            y++;
        if(dir == 2)
        {
            x++;
            y++;
        }
        if(dir == 3)
            x--;
        if(dir == 4)
            x++;
        if(dir == 5)
        {
            x--;
            y--;
        }
        if(dir == 6)
            y--;
        if(dir == 7)
        {
            x++;
            y--;
        }
        if(animation != -1 && Animation.anims[animation].priority == 1)
            animation = -1;
        if(path_length < 9)
            path_length++;
        for(int l = path_length; l > 0; l--)
        {
            path_x[l] = path_x[l - 1];
            path_y[l] = path_y[l - 1];
            path_run[l] = path_run[l - 1];
        }
            path_x[0] = x;
            path_y[0] = y;
            path_run[0] = run;
    }

    public int entScreenX;
	public int entScreenY;
	public final int index = -1;
	public boolean isVisible()
    {
        return false;
    }

    Entity()
    {
        path_x = new int[10];
        path_y = new int[10];
        interactingEntity = -1;
        anInt1504 = 32;
        anInt1505 = -1;
        height = 200;
        anInt1511 = -1;
        anInt1512 = -1;
        hitArray = new int[4];
        hitMarkTypes = new int[4];
        hitsLoopCycle = new int[4];
        anInt1517 = -1;
        anInt1520 = -1;
        animation = -1;
        loopCycleStatus = -1000;
        textCycle = 100;
        bound_dim = 1;
        aBoolean1541 = false;
        path_run = new boolean[10];
        anInt1554 = -1;
        anInt1555 = -1;
        anInt1556 = -1;
        anInt1557 = -1;
    }

    public final int[] path_x;
    public final int[] path_y;
    public int interactingEntity;
    int anInt1503;
    int anInt1504;
    int anInt1505;
    public String textSpoken;
    public int height;
    public int turnDirection;
    int anInt1511;
    int anInt1512;
    int anInt1513;
    final int[] hitArray;
    final int[] hitMarkTypes;
    final int[] hitsLoopCycle;
    int anInt1517;
    int anInt1518;
    int anInt1519;
    int anInt1520;
    int anInt1521;
    int anInt1522;
    int anInt1523;
    int anInt1524;
    int path_length;
    public int animation;
    int anInt1527;
    int anInt1528;
    int anInt1529;
    int anInt1530;
    int anInt1531;
    public int loopCycleStatus;
    public int currentHealth;
    public int maxHealth;
    int textCycle;
    int anInt1537;
    int anInt1538;
    int anInt1539;
    int bound_dim;
    boolean aBoolean1541;
    int anInt1542;
    int anInt1543;
    int anInt1544;
    int anInt1545;
    int anInt1546;
    int anInt1547;
    int anInt1548;
    int anInt1549;
    public int bound_extent_x;
    public int bound_extent_y;
    int anInt1552;
    final boolean[] path_run;
    int anInt1554;
    int anInt1555;
    int anInt1556;
    int anInt1557;
}