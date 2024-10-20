package X;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.FileUriExposedException;
import android.os.TransactionTooLargeException;

/* renamed from: X.0dv, reason: invalid class name */
/* loaded from: 0dv.class */
public abstract class C0dv {
    public static ClipData A00(Context context) {
        ClipData.Item itemAt;
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (clipboardManager == null) {
            0fH.A0k("ClipboardUtil", "Failed to retrieve clipboard service");
            return null;
        }
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null) {
                return null;
            }
            try {
                clipboardManager.setPrimaryClip(ClipData.newPlainText(null, itemAt.coerceToText(context).toString()));
                return primaryClip;
            } catch (RuntimeException e) {
                if (!(e.getCause() instanceof TransactionTooLargeException)) {
                    throw e;
                }
                0fH.A0r("ClipboardUtil", "ClipText is too long", e);
                return null;
            }
        } catch (SecurityException e2) {
            0fH.A0r("ClipboardUtil", "Failed to retrieve clipboard contents", e2);
            return null;
        }
    }

    public static void A01(ClipData clipData, Context context) {
        if (clipData != null) {
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            if (clipboardManager == null) {
                0fH.A0k("ClipboardUtil", "Failed to retrieve clipboard service");
                return;
            }
            try {
                clipboardManager.setPrimaryClip(clipData);
            } catch (SecurityException e) {
                0fH.A0r("ClipboardUtil", "Failed to restore clipboard", e);
            } catch (Exception e2) {
                if (!(e2 instanceof FileUriExposedException)) {
                    throw e2;
                }
                0fH.A0r("ClipboardUtil", "Failed to restore clipboard with data ", e2);
            }
        }
    }

    public static void A02(Context context, String str) {
        A03(context, str, null);
    }

    public static void A03(Context context, String str, String str2) {
        CharSequence applicationLabel;
        if (context == null || str == null) {
            return;
        }
        try {
            if (1JF.A0B(str2)) {
                PackageManager packageManager = context.getPackageManager();
                ApplicationInfo applicationInfo = null;
                if (packageManager != null) {
                    try {
                        applicationInfo = packageManager.getApplicationInfo(((PackageItemInfo) context.getApplicationInfo()).packageName, 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    if (applicationInfo != null) {
                        applicationLabel = packageManager.getApplicationLabel(applicationInfo);
                        str2 = String.valueOf(applicationLabel);
                    }
                }
                applicationLabel = context.getString(R.string.untitled);
                str2 = String.valueOf(applicationLabel);
            }
            ClipData newPlainText = ClipData.newPlainText(str2, str);
            ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
            if (clipboardManager == null) {
                0fH.A0k("ClipboardUtil", "Failed to get clipboard service");
            } else {
                clipboardManager.setPrimaryClip(newPlainText);
            }
        } catch (SecurityException e) {
            if (Build.VERSION.SDK_INT != 29) {
                throw e;
            }
            0fH.A0r("ClipboardUtil", "Failed to copy to clipboard", e);
        }
    }
}
