package X;

import android.content.Context;
import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: F6a.class */
public final class F6a {
    public String A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final String A06;
    public final boolean A07;

    public F6a(Boolean bool, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A06 = str;
        this.A07 = z;
        this.A02 = z2;
        this.A04 = z3;
        this.A05 = z4;
        this.A00 = str2;
        this.A03 = z5;
        if (bool != null) {
            this.A01 = bool.booleanValue();
        }
    }

    public static F6a A00(Context context) {
        Boolean bool = null;
        Cursor A01 = 0L0.A01(context.getContentResolver(), AbM.A09(EaF.A00.buildUpon().appendPath("package"), context.getPackageName()), (String) null, (String) null, (String[]) null, (String[]) null, -1630508427);
        if (A01 == null) {
            throw AnonymousClass001.A0N("Failed to fetch settings: null cursor.");
        }
        try {
            if (!A01.moveToFirst()) {
                throw AnonymousClass001.A0N("Failed to fetch settings: empty cursor");
            }
            int columnIndex = A01.getColumnIndex("package_name");
            int columnIndex2 = A01.getColumnIndex(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
            int columnIndex3 = A01.getColumnIndex("is_managed");
            int columnIndex4 = A01.getColumnIndex("auto_updates");
            int columnIndex5 = A01.getColumnIndex("notif_update_available");
            int columnIndex6 = A01.getColumnIndex("notif_update_installed");
            int columnIndex7 = A01.getColumnIndex("rollout_token");
            int columnIndex8 = A01.getColumnIndex("terms_of_service_accepted");
            int columnIndex9 = A01.getColumnIndex("show_accept_tos");
            int columnIndex10 = A01.getColumnIndex("show_show_explicit_tos");
            int columnIndex11 = A01.getColumnIndex("is_restricted_mode");
            int columnIndex12 = A01.getColumnIndex("wa_updates_enabled");
            int columnIndex13 = A01.getColumnIndex("updates_over_cellular_enabled");
            int columnIndex14 = A01.getColumnIndex("wa_cross_install_enabled");
            String string = A01.getString(columnIndex);
            A01.getString(columnIndex2);
            boolean A1N = AnonymousClass001.A1N(A01.getInt(columnIndex3));
            boolean A1N2 = AnonymousClass001.A1N(A01.getInt(columnIndex4));
            boolean A1N3 = AnonymousClass001.A1N(A01.getInt(columnIndex5));
            boolean A1N4 = AnonymousClass001.A1N(A01.getInt(columnIndex6));
            String string2 = A01.getString(columnIndex7);
            boolean A1N5 = columnIndex8 >= 0 ? AnonymousClass001.A1N(A01.getInt(columnIndex8)) : false;
            if (columnIndex9 >= 0) {
                A01.getInt(columnIndex9);
                A01.getInt(columnIndex10);
            }
            if (columnIndex11 >= 0) {
                A01.getInt(columnIndex11);
            }
            if (columnIndex12 >= 0) {
                A01.getInt(columnIndex12);
            }
            if (columnIndex13 >= 0) {
                bool = Boolean.valueOf(AnonymousClass001.A1N(A01.getInt(columnIndex13)));
            }
            if (columnIndex14 >= 0) {
                A01.getInt(columnIndex14);
            }
            return new F6a(bool, string, string2, A1N, A1N2, A1N3, A1N4, A1N5);
        } finally {
            A01.close();
        }
    }
}
