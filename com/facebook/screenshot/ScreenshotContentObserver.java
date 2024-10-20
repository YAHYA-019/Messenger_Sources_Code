package com.facebook.screenshot;

import X.0Kt;
import X.0L0;
import X.0Pz;
import X.0S2;
import X.1Bi;
import X.1Bn;
import X.1JF;
import X.5FE;
import X.5FK;
import X.C0dp;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.inject.FbInjector;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: ScreenshotContentObserver.class */
public final class ScreenshotContentObserver extends ContentObserver {
    public static final String[] A07 = {"_display_name", "_id", "_data"};
    public 5FE A00;
    public String A01;
    public Set A02;
    public final Context A03;
    public final C0dp A04;
    public final 5FK A05;
    public final Set A06;

    public ScreenshotContentObserver() {
        super((Handler) 1Bn.A0A(16453));
        this.A06 = new HashSet();
        this.A02 = new HashSet();
        this.A01 = "";
        C0dp c0dp = (C0dp) 1Bi.A03(99390);
        Context A00 = FbInjector.A00();
        5FK r0 = (5FK) 1Bi.A03(49608);
        this.A04 = c0dp;
        this.A03 = A00;
        this.A05 = r0;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        5FK r308;
        String str;
        Cursor A01;
        5FK r3082;
        String obj;
        if (uri == null || uri == Uri.EMPTY) {
            r308 = this.A05;
            str = "Empty uri received.";
        } else {
            String obj2 = uri.toString();
            Uri uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            if (obj2.startsWith(uri2.toString())) {
                long seconds = TimeUnit.MILLISECONDS.toSeconds(this.A04.now());
                Cursor cursor = null;
                long j = 10;
                try {
                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s > %s AND %s < %s AND %s LIKE %s", "date_added", Long.valueOf(seconds - j), "date_added", Long.valueOf(seconds + j), "_display_name", "'%screenshot%'");
                    String str2 = this.A01;
                    if (!str2.isEmpty()) {
                        formatStrLocaleSafe = formatStrLocaleSafe.concat(StringFormatUtil.formatStrLocaleSafe(" AND %s LIKE %s", "_data", 0Pz.A0j("'%", str2, "/%'")));
                    }
                    if (Build.VERSION.SDK_INT >= 30) {
                        Bundle bundle = new Bundle();
                        bundle.putString("android:query-arg-sql-selection", formatStrLocaleSafe);
                        bundle.putStringArray("android:query-arg-sql-selection-args", null);
                        bundle.putStringArray("android:query-arg-sort-columns", new String[]{"datetaken"});
                        bundle.putInt("android:query-arg-sort-direction", 1);
                        bundle.putInt("android:query-arg-limit", 1);
                        try {
                            ContentResolver contentResolver = this.A03.getContentResolver();
                            String[] strArr = A07;
                            0Kt.A00(0S2.A01, uri.getAuthority(), 714892800);
                            A01 = contentResolver.query(uri, strArr, bundle, null);
                        } catch (IllegalArgumentException e) {
                            this.A05.BxP(0Pz.A0V("Content resolver threw: ", e));
                            return;
                        }
                    } else {
                        A01 = 0L0.A01(this.A03.getContentResolver(), uri, formatStrLocaleSafe, "date_added DESC LIMIT 1", A07, (String[]) null, -339746333);
                    }
                    if (A01 == null || !A01.moveToFirst()) {
                        this.A05.BxP(0Pz.A0W("Content resolver cursor was null or empty: ", uri.toString()));
                        if (A01 == null) {
                            return;
                        }
                    } else if (this.A00 != null) {
                        String string = A01.getString(A01.getColumnIndex("_data"));
                        if (1JF.A0B(string)) {
                            r3082 = this.A05;
                            obj = "Path is null or empty";
                        } else {
                            Long valueOf = Long.valueOf(A01.getLong(A01.getColumnIndex("_id")));
                            if (this.A06.add(valueOf)) {
                                5FE r0 = this.A00;
                                if (r0 != null) {
                                    r0.A05(string);
                                }
                                this.A05.CP2(uri.toString(), string);
                            } else {
                                r3082 = this.A05;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Duplicate screenshot detected. ID: ");
                                sb.append(valueOf);
                                obj = sb.toString();
                            }
                        }
                        r3082.BxP(obj);
                    }
                    A01.close();
                    return;
                } catch (Throwable th) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            r308 = this.A05;
            str = 0Pz.A0W("Content URI does not start with: ", uri2.toString());
        }
        r308.BxP(str);
    }
}
