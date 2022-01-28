package com.bifan.txtreaderlib.main;

import android.graphics.Paint;


public class PaintContext {
    public Paint textPaint;
    public Paint selectTextPaint;
    public Paint sliderPaint;
    public Paint notePaint;

    public PaintContext() {
        textPaint = new Paint();
        selectTextPaint = new Paint();
        notePaint = new Paint();
        sliderPaint = new Paint();
    }

    public void onDestroy(){
        textPaint = null;
        selectTextPaint =null;
        notePaint = null;
        sliderPaint =null;
    }
}
