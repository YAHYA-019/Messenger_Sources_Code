package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.2v1, reason: invalid class name */
/* loaded from: 2v1.class */
public abstract class C2v1 {
    public void A02(2vG r302) {
        if (!(this instanceof C2v9)) {
            if (this instanceof C2v6) {
                C2v6 c2v6 = (C2v6) this;
                c2v6.A03.markerPoint(c2v6.A00, r302.A02, "load_batch_start");
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r302.A02);
        sb.append(" ");
        sb.append("onLoadBatchStart");
        sb.append(" ");
        sb.append(r302.A03);
        sb.append(" ");
        C2v9.A00(r302, sb);
        C2v9.A01((C2v9) this, sb);
    }

    public void A03(2vG r302, IOException iOException) {
        String str;
        if (this instanceof C2v6) {
            C2v6 c2v6 = (C2v6) this;
            if (iOException != null) {
                str = iOException.getMessage();
                if (str == null) {
                    str = AnonymousClass001.A0X(iOException);
                }
            } else {
                str = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS;
            }
            c2v6.A03.markerPoint(c2v6.A00, r302.A02, "load_batch_finish", str);
            return;
        }
        if (this instanceof C2v9) {
            C2v9 c2v9 = (C2v9) this;
            StringBuilder sb = new StringBuilder();
            sb.append(r302.A02);
            sb.append(" ");
            sb.append("onLoadBatchComplete");
            sb.append(" ");
            sb.append("exception: ");
            Object obj = iOException;
            if (iOException == null) {
                obj = "null";
            }
            sb.append(obj);
            sb.append(" ");
            sb.append(r302.A03);
            sb.append(" ");
            C2v9.A00(r302, sb);
            C2v9.A01(c2v9, sb);
        }
    }

    public void A04(2vG r302, IOException iOException, String str) {
        int indexOf;
        String str2;
        if (this instanceof C2v6) {
            C2v6 c2v6 = (C2v6) this;
            Locale locale = Locale.US;
            synchronized (r302) {
                ArrayList arrayList = r302.A00;
                if (arrayList == null) {
                    new ArrayList(r302.A09.size());
                }
                r302.A00 = arrayList;
                indexOf = arrayList.indexOf(str);
                if (indexOf < 0) {
                    arrayList.add(str);
                    indexOf = arrayList.size() - 1;
                }
            }
            String format = String.format(locale, "%s%d_finish", "load", Integer.valueOf(indexOf));
            if (iOException != null) {
                str2 = iOException.getMessage();
                if (str2 == null) {
                    str2 = AnonymousClass001.A0X(iOException);
                }
            } else {
                str2 = OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS;
            }
            c2v6.A03.markerPoint(c2v6.A00, r302.A02, format, str2);
        }
    }

    public void A05(2vG r302, String str) {
        int indexOf;
        if (this instanceof C2v6) {
            C2v6 c2v6 = (C2v6) this;
            Locale locale = Locale.US;
            synchronized (r302) {
                ArrayList arrayList = r302.A00;
                if (arrayList == null) {
                    new ArrayList(r302.A09.size());
                }
                r302.A00 = arrayList;
                indexOf = arrayList.indexOf(str);
                if (indexOf < 0) {
                    arrayList.add(str);
                    indexOf = arrayList.size() - 1;
                }
            }
            c2v6.A03.markerPoint(c2v6.A00, r302.A02, String.format(locale, "%s%d_start", "load", Integer.valueOf(indexOf)), str);
        }
    }
}
