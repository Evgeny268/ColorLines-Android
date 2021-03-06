package com.evgendev.colorlines;

import android.content.Context;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {


        @Test
    public void delete_balls_1(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[0][0] = 1;
        colorLines.getField()[0][1] = 1;
        colorLines.getField()[0][2] = 1;
        colorLines.getField()[0][3] = 1;
        colorLines.getField()[0][4] = 1;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void delete_balls_2(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[0][4] = 6;
        colorLines.getField()[0][5] = 6;
        colorLines.getField()[0][6] = 6;
        colorLines.getField()[0][7] = 6;
        colorLines.getField()[0][8] = 6;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void delete_balls_3(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[2][3] = 6;
        colorLines.getField()[2][4] = 6;
        colorLines.getField()[2][5] = 6;
        colorLines.getField()[2][6] = 6;
        colorLines.getField()[2][7] = 6;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void delete_balls_4(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[2][3] = 6;
        colorLines.getField()[2][4] = 6;
        colorLines.getField()[2][5] = 6;
        colorLines.getField()[2][6] = 6;
        colorLines.getField()[2][7] = 6;
        colorLines.getField()[3][3] = 6;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void delete_balls_5(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[2][0] = 6;
        colorLines.getField()[2][1] = 6;
        colorLines.getField()[2][2] = 6;
        colorLines.getField()[2][3] = 6;
        colorLines.getField()[2][4] = 6;
        colorLines.getField()[2][5] = 6;
        colorLines.getField()[2][6] = 6;
        colorLines.getField()[2][7] = 6;
        colorLines.getField()[2][8] = 6;
        assertEquals(18,colorLines.checkLines());
    }

    @Test
    public void delete_balls_6(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[0][0] = 1;
        colorLines.getField()[1][0] = 1;
        colorLines.getField()[2][0] = 1;
        colorLines.getField()[3][0] = 1;
        colorLines.getField()[4][0] = 1;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void delete_balls_7(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[3][2] = 6;
        colorLines.getField()[4][2] = 6;
        colorLines.getField()[5][2] = 6;
        colorLines.getField()[6][2] = 6;
        colorLines.getField()[7][2] = 6;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void delete_balls_8(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[4][2] = 6;
        colorLines.getField()[5][2] = 6;
        colorLines.getField()[6][2] = 6;
        colorLines.getField()[7][2] = 6;
        colorLines.getField()[8][2] = 6;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void delete_balls_9(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[0][3] = 6;
        colorLines.getField()[1][3] = 6;
        colorLines.getField()[2][3] = 6;
        colorLines.getField()[3][3] = 6;
        colorLines.getField()[4][3] = 6;
        colorLines.getField()[5][3] = 6;
        colorLines.getField()[6][3] = 6;
        colorLines.getField()[7][3] = 6;
        colorLines.getField()[8][3] = 6;
        assertEquals(18,colorLines.checkLines());
    }

    @Test
    public void delete_balls_10(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[1][0] = 0;
        colorLines.getField()[1][1] = 1;
        colorLines.getField()[1][2] = 1;
        colorLines.getField()[1][3] = 6;
        colorLines.getField()[1][4] = 6;
        colorLines.getField()[1][5] = 6;
        colorLines.getField()[1][6] = 6;
        colorLines.getField()[1][7] = 6;
        colorLines.getField()[1][8] = 2;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void delete_balls_diagonal_1(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[0][0] = 6;
        colorLines.getField()[1][1] = 6;
        colorLines.getField()[2][2] = 6;
        colorLines.getField()[3][3] = 6;
        colorLines.getField()[4][4] = 6;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void delete_balls_diagonal_2(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[4][4] = 6;
        colorLines.getField()[5][5] = 6;
        colorLines.getField()[6][6] = 6;
        colorLines.getField()[7][7] = 6;
        colorLines.getField()[8][8] = 6;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void delete_balls_diagonal_3(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[0][4] = 6;
        colorLines.getField()[1][5] = 6;
        colorLines.getField()[2][6] = 6;
        colorLines.getField()[3][7] = 6;
        colorLines.getField()[4][8] = 6;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void delete_balls_diagonal_4(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[4][0] = 6;
        colorLines.getField()[5][1] = 6;
        colorLines.getField()[6][2] = 6;
        colorLines.getField()[7][3] = 6;
        colorLines.getField()[8][4] = 6;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void delete_balls_diagonal_5(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[0][8] = 6;
        colorLines.getField()[1][7] = 6;
        colorLines.getField()[2][6] = 6;
        colorLines.getField()[3][5] = 6;
        colorLines.getField()[4][4] = 6;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void delete_balls_diagonal_6(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[8][0] = 6;
        colorLines.getField()[7][1] = 6;
        colorLines.getField()[6][2] = 6;
        colorLines.getField()[5][3] = 6;
        colorLines.getField()[4][4] = 6;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void delete_balls_diagonal_7(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[7][1] = 6;
        colorLines.getField()[6][2] = 6;
        colorLines.getField()[5][3] = 6;
        colorLines.getField()[4][4] = 6;
        colorLines.getField()[3][5] = 6;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void delete_balls_diagonal_8(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[0][0] = 6;
        colorLines.getField()[1][1] = 6;
        colorLines.getField()[2][2] = 6;
        colorLines.getField()[3][3] = 6;
        colorLines.getField()[4][4] = 6;
        colorLines.getField()[5][5] = 6;
        colorLines.getField()[6][6] = 6;
        colorLines.getField()[7][7] = 6;
        colorLines.getField()[8][8] = 6;
        assertEquals(18,colorLines.checkLines());
    }

    @Test
    public void delete_balls_diagonal_9(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[1][0] = 6;
        colorLines.getField()[2][1] = 6;
        colorLines.getField()[3][2] = 6;
        colorLines.getField()[4][3] = 6;
        colorLines.getField()[5][4] = 6;
        colorLines.getField()[6][5] = 6;
        colorLines.getField()[7][6] = 6;
        colorLines.getField()[8][7] = 6;
        assertEquals(16,colorLines.checkLines());
    }

    @Test
    public void delete_balls_diagonal_10(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[0][1] = 6;
        colorLines.getField()[1][2] = 6;
        colorLines.getField()[2][3] = 6;
        colorLines.getField()[3][4] = 6;
        colorLines.getField()[4][5] = 6;
        colorLines.getField()[5][6] = 6;
        colorLines.getField()[6][7] = 6;
        colorLines.getField()[7][8] = 6;
        assertEquals(16,colorLines.checkLines());
    }

    @Test
    public void delete_balls_diagonal_11(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[0][1] = 2;
        colorLines.getField()[1][2] = 2;
        colorLines.getField()[2][3] = 6;
        colorLines.getField()[3][4] = 6;
        colorLines.getField()[4][5] = 6;
        colorLines.getField()[5][6] = 6;
        colorLines.getField()[6][7] = 6;
        colorLines.getField()[7][8] = 1;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void delete_balls_diagonal_12(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[0][0] = 0;
        colorLines.getField()[1][1] = 2;
        colorLines.getField()[2][2] = 2;
        colorLines.getField()[3][3] = 6;
        colorLines.getField()[4][4] = 6;
        colorLines.getField()[5][5] = 6;
        colorLines.getField()[6][6] = 6;
        colorLines.getField()[7][7] = 6;
        colorLines.getField()[8][8] = 1;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void leftUpDiagonal(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[0][4]=1;
        colorLines.getField()[1][3]=1;
        colorLines.getField()[2][2]=1;
        colorLines.getField()[3][1]=1;
        colorLines.getField()[4][0]=1;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void leftUpDiagonal_2(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[1][4]=1;
        colorLines.getField()[2][3]=1;
        colorLines.getField()[3][2]=1;
        colorLines.getField()[4][1]=1;
        colorLines.getField()[5][0]=1;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void leftUpDiagonal_3(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[0][5]=1;
        colorLines.getField()[1][4]=1;
        colorLines.getField()[2][3]=1;
        colorLines.getField()[3][2]=1;
        colorLines.getField()[4][1]=1;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void rightUpDiagonal_1(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[3][8]=1;
        colorLines.getField()[4][7]=1;
        colorLines.getField()[5][6]=1;
        colorLines.getField()[6][5]=1;
        colorLines.getField()[7][4]=1;
        colorLines.getField()[4][8]=2;
        colorLines.getField()[8][4]=3;
        colorLines.getField()[8][5]=3;
        colorLines.getField()[7][5]=3;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void rightUpDiagonal_2(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[8][3]=1;
        colorLines.getField()[7][4]=1;
        colorLines.getField()[6][5]=1;
        colorLines.getField()[5][6]=1;
        colorLines.getField()[4][7]=1;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void deleteQuad(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        colorLines.getField()[0][0]=1;
        colorLines.getField()[0][1]=1;
        colorLines.getField()[0][2]=1;
        colorLines.getField()[0][3]=1;
        colorLines.getField()[0][4]=1;
        colorLines.getField()[1][4]=1;
        colorLines.getField()[2][4]=1;
        colorLines.getField()[3][4]=1;
        colorLines.getField()[4][4]=1;
        colorLines.getField()[4][3]=1;
        colorLines.getField()[4][2]=1;
        colorLines.getField()[4][1]=1;
        colorLines.getField()[4][0]=1;
        colorLines.getField()[3][0]=1;
        colorLines.getField()[2][0]=1;
        colorLines.getField()[1][0]=1;
        assertEquals(16*2,colorLines.checkLines());
    }

    @Test
    public void delete_probled_diagonal_1(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        // 1- красный
        // 2 - фиолетовый(темный)
        // 3 - желтый
        // 4 - зеленый
        // 5 - морской
        // 6 - фиолтовый (светлый)
        // 7 - голубой
        colorLines.getField()[0][1]=1; //линия 1
        colorLines.getField()[0][6]=4;
        colorLines.getField()[0][7]=3;
        colorLines.getField()[1][1]=1; //линия 2
        colorLines.getField()[1][2]=2;
        colorLines.getField()[1][3]=4;
        colorLines.getField()[2][1]=4; //линия 3
        colorLines.getField()[3][0]=7; //линия 4
        colorLines.getField()[3][3]=2;
        colorLines.getField()[3][6]=2;
        colorLines.getField()[4][1]=7; //линия 5
        colorLines.getField()[4][3]=5;
        colorLines.getField()[4][5]=2;
        colorLines.getField()[4][7]=5;
        colorLines.getField()[4][8]=6;
        colorLines.getField()[5][2]=7; //линия 6
        colorLines.getField()[5][6]=1;
        colorLines.getField()[5][7]=2;
        colorLines.getField()[6][2]=3; //линия 7
        colorLines.getField()[6][3]=7;
        colorLines.getField()[6][4]=4;
        colorLines.getField()[6][7]=3;
        colorLines.getField()[7][4]=7; //линия 8
        colorLines.getField()[7][7]=5;
        colorLines.getField()[8][1]=5; //линия 9
        colorLines.getField()[8][6]=5;
        colorLines.getField()[8][7]=4;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void delete_probled_diagonal_1_inverse(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        // 1- красный
        // 2 - фиолетовый(темный)
        // 3 - желтый
        // 4 - зеленый
        // 5 - морской
        // 6 - фиолтовый (светлый)
        // 7 - голубой
        colorLines.getField()[1][0]=1; //линия 1
        colorLines.getField()[6][0]=4;
        colorLines.getField()[7][0]=3;
        colorLines.getField()[1][1]=1; //линия 2
        colorLines.getField()[2][1]=2;
        colorLines.getField()[3][1]=4;
        colorLines.getField()[1][2]=4; //линия 3
        colorLines.getField()[0][3]=7; //линия 4
        colorLines.getField()[3][3]=2;
        colorLines.getField()[6][3]=2;
        colorLines.getField()[1][4]=7; //линия 5
        colorLines.getField()[3][4]=5;
        colorLines.getField()[5][4]=2;
        colorLines.getField()[7][4]=5;
        colorLines.getField()[8][4]=6;
        colorLines.getField()[2][5]=7; //линия 6
        colorLines.getField()[6][5]=1;
        colorLines.getField()[7][5]=2;
        colorLines.getField()[2][6]=3; //линия 7
        colorLines.getField()[3][6]=7;
        colorLines.getField()[4][6]=4;
        colorLines.getField()[7][6]=3;
        colorLines.getField()[4][7]=7; //линия 8
        colorLines.getField()[7][7]=5;
        colorLines.getField()[1][8]=5; //линия 9
        colorLines.getField()[6][8]=5;
        colorLines.getField()[7][8]=4;
        assertEquals(10,colorLines.checkLines());
    }

    @Test
    public void delete_probled_diagonal_1_inverse_mode(){
        ColorLines colorLines = new ColorLines(9);
        for (int i = 0; i < colorLines.getFieldSize(); i++) {
            for (int j = 0; j < colorLines.getFieldSize(); j++) {
                colorLines.getField()[i][j] = 0;
            }
        }
        // 1- красный
        // 2 - фиолетовый(темный)
        // 3 - желтый
        // 4 - зеленый
        // 5 - морской
        // 6 - фиолтовый (светлый)
        // 7 - голубой
        //colorLines.getField()[1][0]=1; //линия 1
        //colorLines.getField()[6][0]=4;
        //colorLines.getField()[7][0]=3;
        //colorLines.getField()[1][1]=1; //линия 2
        //colorLines.getField()[2][1]=2;
        //colorLines.getField()[3][1]=4;
        //colorLines.getField()[1][2]=4; //линия 3
        colorLines.getField()[0][3]=7; //линия 4
        //colorLines.getField()[3][3]=2;
       // colorLines.getField()[6][3]=2;
        colorLines.getField()[1][4]=7; //линия 5
       // colorLines.getField()[3][4]=5;
        //colorLines.getField()[5][4]=2;
       // colorLines.getField()[7][4]=5;
        //colorLines.getField()[8][4]=6;
        colorLines.getField()[2][5]=7; //линия 6
        //colorLines.getField()[6][5]=1;
        //colorLines.getField()[7][5]=2;
        //colorLines.getField()[2][6]=3; //линия 7
        colorLines.getField()[3][6]=7;
        //colorLines.getField()[4][6]=4;
        //colorLines.getField()[7][6]=3;
        colorLines.getField()[4][7]=7; //линия 8
        //colorLines.getField()[7][7]=5;
        //colorLines.getField()[1][8]=5; //линия 9
        //colorLines.getField()[6][8]=5;
        colorLines.getField()[7][8]=4;
        assertEquals(10,colorLines.checkLines());
    }

}
