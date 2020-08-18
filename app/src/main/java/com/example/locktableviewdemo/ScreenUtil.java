package com.example.locktableviewdemo;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class ScreenUtil {

    /**
     * 屏幕宽度（像素）
     * @param context
     * @return
     */
    public static int getWidth(Context context)
    {
        WindowManager wm = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics outMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(outMetrics);
        return outMetrics.widthPixels;
    }

    /**
     *  屏幕高度（像素）
     * @param context
     * @return
     */
    public static int getHeight(Context context)
    {
        WindowManager wm = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics outMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(outMetrics);
        return outMetrics.heightPixels;
    }

    /**
     *  屏幕密度（0.75 / 1.0 / 1.5）
     * @param context
     * @return
     */
    public static float getDensity(Context context)
    {
        WindowManager wm = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics outMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(outMetrics);
        return outMetrics.density;
    }

    /**
     * 屏幕密度dpi（120 / 160 / 240）
     * @param context
     * @return
     */
    public static int getDensityDpi(Context context)
    {
        WindowManager wm = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics outMetrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(outMetrics);
        return outMetrics.densityDpi;
    }

    /**
     * 屏幕宽度(dp)
     * @param context
     * @return
     */
    public static int getScreenWidth(Context context)
    {
        // 屏幕宽度算法:屏幕宽度（像素）/屏幕密度
        int screenWidth = (int) (getWidth(context) / getDensity(context));  // 屏幕宽度(dp)
        return screenWidth;
    }

    /**
     * 屏幕高度(dp)
     * @param context
     * @return
     */
    public static int getScreenHeight(Context context)
    {
        int screenHeight = (int) (getHeight(context) / getDensity(context));
        return screenHeight;
    }

}
