package com.mufiid.lib;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

public class Toaster {

    public static final int LENGTH_SHORT = Toast.LENGTH_SHORT;
    public static final String SUCCESS = "success";
    public static final String INFO = "info";
    public static final String WARNING = "warning";
    public static final String DANGER = "danger";

    private static boolean allowQueue = true;
    private static Toast lastToast = null;

    private Toaster() { }

    public static Toast success(@NonNull Context context, @NonNull String message) {
        return success(context, message, LENGTH_SHORT);
    }

    public static Toast success(@NonNull Context context, @NonNull String message, int duration) {
        return custom(context, message, LENGTH_SHORT, SUCCESS);
    }

    public static Toast warning(@NonNull Context context, @NonNull String message) {
        return warning(context, message, LENGTH_SHORT);
    }

    public static Toast warning(@NonNull Context context, @NonNull String message, int duration) {
        return custom(context, message, LENGTH_SHORT, WARNING);
    }

    public static Toast danger(@NonNull Context context, @NonNull String message) {
        return danger(context, message, LENGTH_SHORT);
    }

    public static Toast danger(@NonNull Context context, @NonNull String message, int duration) {
        return custom(context, message, LENGTH_SHORT, DANGER);
    }

    public static Toast info(@NonNull Context context, @NonNull String message) {
        return info(context, message, LENGTH_SHORT);
    }

    public static Toast info(@NonNull Context context, @NonNull String message, int duration) {
        return custom(context, message, LENGTH_SHORT, INFO);
    }

    public static Toast custom(@NonNull Context context, @NonNull String message, int duration, @NonNull String type) {
        final Toast currentToast = Toast.makeText(context, "", duration);
        final View toastLayout = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.toast_layout, null);
        final ImageView toastIcon = toastLayout.findViewById(R.id.toast_icon);
        final TextView toastMessage = toastLayout.findViewById(R.id.toast_text);

        switch (type) {
            case SUCCESS :
                ToasterUtils.setBackground(toastLayout, ContextCompat.getDrawable(context, R.drawable.bg_toast_success));
                break;
            case INFO :
                ToasterUtils.setBackground(toastLayout, ContextCompat.getDrawable(context, R.drawable.bg_toast_info));
                break;
            case WARNING:
                ToasterUtils.setBackground(toastLayout, ContextCompat.getDrawable(context, R.drawable.bg_toast_warning));
                break;
            case DANGER :
                ToasterUtils.setBackground(toastLayout, ContextCompat.getDrawable(context, R.drawable.bg_toast_danger));
                break;
        }

        toastMessage.setText(message);
        currentToast.setView(toastLayout);

        if (!allowQueue){
            if (lastToast != null)
                lastToast.cancel();
            lastToast = currentToast;
        }

        return currentToast;

    }
}
