/*
    Отрисовка игрового поля для игры ColorLines
 */
package com.evgendev.colorlines;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.SurfaceHolder;

import java.util.ArrayList;

public class CLinesSurfaceView extends GameSurfaceView {

    private int colorsCount = 1;
    private ArrayList<BallColor> colors;//Заранее подготовленные цвета для шариков
    private volatile boolean canvasReady = false; //Статут готовности canvas
    private int [][]lastField = null; //Последнее прорисованное поле
    private int[]lastSelect = null; //Последний выбранный шар
    public CLinesSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void drawField(int [][]gameField, int []selectedBall){
        Canvas canvas = surfaceHolder.lockCanvas();
        drawOrigin(canvas);
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                if (gameField[i][j]!=0) {
                    int color = 0;
                    if (i == selectedBall[0] && j == selectedBall[1]) {
                        color = colors.get(gameField[i][j] - 1).selected;
                    } else {
                        color = colors.get(gameField[i][j] - 1).normal;
                    }
                    float []cc = {360,1,1};
                    setCell(canvas, i, j, CellType.CIRCLE, color, 80);
                }
            }
        }
        lastField = new int[gameField.length][gameField.length];
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField.length; j++) {
                lastField[i][j] = gameField[i][j];
            }
        }
        lastSelect = new int[selectedBall.length];
        System.arraycopy(selectedBall,0,lastSelect,0,lastSelect.length);
        if (showGrid) drawGrid(canvas,fieldSize);
        surfaceHolder.unlockCanvasAndPost(canvas);
        return;
    }

    public int getColorsCount() {
        return colorsCount;
    }

    public boolean isCanvasReady() {
        return canvasReady;
    }

    //Подготовка (генерация) цветов для шаров
    public void setColorsCount(int colorsCount) {
        this.colorsCount = colorsCount;
        colors = new ArrayList<>();
        float interval = 360 / (colorsCount);
        float []normal = new float[3];
        float []selected = new float[3];
        for (float x = 0; x < 360; x += interval) {
            normal[0] = x;
            normal[1] = 0.7f;
            normal[2] = 1;
            selected[0] = x;
            selected[1] = 0.3f;
            selected[2] = 1;
            colors.add(new BallColor(Color.HSVToColor(normal),Color.HSVToColor(selected)));
        }
    }

    private class BallColor {

        public int normal = 0;
        public int selected = 0;

        public BallColor(int normal, int selected) {
            this.normal = normal;
            this.selected = selected;
        }

    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        canvasReady = true;
        if (lastField==null || lastSelect == null) return;
        drawField(lastField,lastSelect);
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        canvasReady = false;
    }
}
