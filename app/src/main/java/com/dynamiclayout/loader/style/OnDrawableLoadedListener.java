package com.dynamiclayout.loader.style;

import android.graphics.drawable.Drawable;

interface OnDrawableLoadedListener {

    void onDrawableLoaded(Drawable drawable, int requestCode);
}