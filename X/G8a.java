package X;

import android.database.Cursor;
import android.graphics.PorterDuff;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.neue.nux.businessinbox.BiiMCatalogNuxFragment;
import com.facebook.messaging.neue.nux.businessrtc.NeueNuxBusinessRTCNuxFragment;
import com.facebook.messaging.neue.nux.messenger.NeueNuxCaaLoginSaveCredentialsFragment;
import com.facebook.messaging.neue.nux.messenger.NeueNuxContactImportFragment;
import com.facebook.messaging.neue.nux.messenger.NeueNuxDeactivationsFragment;
import com.facebook.messaging.neue.nux.messenger.NuxAccountSwitchCompleteFragment;
import com.facebook.messaging.neue.nux.phoneconfirmation.RequestCodeFragment;
import com.facebook.messaging.neue.nux.profilepic.PartialNuxProfilePicFragment;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: G8a.class */
public final class G8a extends HashMap {
    public final int A00;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public G8a(int i) {
        67T r303;
        Object obj;
        PorterDuff.Mode frY;
        String str;
        this.A00 = i;
        switch (i) {
            case 0:
                PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
                put(mode.name(), mode);
                frY = PorterDuff.Mode.SRC_OVER;
                str = frY.name();
                put(str, frY);
                return;
            case 1:
                AnonymousClass001.A1A(7zN.A0h(), this, 2131954346);
                AnonymousClass001.A1A(-16777216, this, 2131954320);
                AnonymousClass001.A1A(-13068304, this, 2131954321);
                AnonymousClass001.A1A(-9387952, this, 2131954328);
                AnonymousClass001.A1A(-144548, this, 2131954347);
                AnonymousClass001.A1A(-160462, this, 2131954336);
                AnonymousClass001.A1A(-1226410, this, 2131954337);
                AnonymousClass001.A1A(-3078039, this, 2131954343);
                AnonymousClass001.A1A(-6092870, this, 2131954340);
                AnonymousClass001.A1A(-1245165, this, 2131954341);
                AnonymousClass001.A1A(-1210994, this, 2131954342);
                AnonymousClass001.A1A(-11565, this, 2131954339);
                AnonymousClass001.A1A(-9292, this, 2131954319);
                AnonymousClass001.A1A(-15486, this, 2131954338);
                AnonymousClass001.A1A(-2977978, this, 2131954329);
                AnonymousClass001.A1A(-6724551, this, 2131954322);
                AnonymousClass001.A1A(-12377308, this, 2131954323);
                AnonymousClass001.A1A(-14923223, this, 2131954327);
                AnonymousClass001.A1A(-14277082, this, 2131954326);
                AnonymousClass001.A1A(-13224394, this, 2131954325);
                AnonymousClass001.A1A(-11184811, this, 2131954324);
                AnonymousClass001.A1A(-9211021, this, 2131954335);
                AnonymousClass001.A1A(-6710887, this, 2131954334);
                AnonymousClass001.A1A(-5066062, this, 2131954333);
                AnonymousClass001.A1A(-3684409, this, 2131954332);
                AnonymousClass001.A1A(-2368549, this, 2131954331);
                AnonymousClass001.A1A(-1052689, this, 2131954330);
                AnonymousClass001.A1A(-16724271, this, 2131954345);
                return;
            case 3:
                put(PartialNuxProfilePicFragment.class, "profile_picture");
                put(NeueNuxContactImportFragment.class, "contact_import");
                put(RequestCodeFragment.class, "phone_confirmation");
                put(NuxAccountSwitchCompleteFragment.class, AbE.A00(371));
                put(NeueNuxDeactivationsFragment.class, AbE.A00(487));
                put(BiiMCatalogNuxFragment.class, "biim_catalog");
                put(NeueNuxBusinessRTCNuxFragment.class, AbE.A00(419));
                r303 = NeueNuxCaaLoginSaveCredentialsFragment.class;
                obj = "caa_login_save_credentials";
                put(r303, obj);
                return;
            case 4:
                put("qt_client_checksum", new FrW());
                put("qt_server_checksum", new FrX());
                frY = new FrY();
                str = "qt_count";
                put(str, frY);
                return;
            case 5:
                put(67T.A01, C67Z.FACEBOOK);
                put(67T.A06, C67Z.MESSENGER);
                put(67T.A03, C67Z.FACEBOOK_LITE);
                r303 = 67T.A04;
                obj = C67Z.INSTAGRAM;
                put(r303, obj);
                return;
            case 10:
                r303 = "resolver_type";
                obj = "content_provider";
                put(r303, obj);
                return;
            default:
                put(67T.A01, new Object());
                put(67T.A06, new Object());
                put(67T.A07, new Object());
                put(67T.A03, new Object());
                put(67T.A04, new Object());
                put(67T.A05, new Object());
                put(67T.A0C, new G7n(C67Z.OCULUS));
                put(67T.A09, new G7n(C67Z.MWA));
                put(67T.A0A, new G7n(C67Z.MWA_DEBUG));
                return;
        }
    }

    public G8a(0CL r302, 0CL r303) {
        this.A00 = 8;
        put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r302.element);
        put("profile_pic_url", r303.element);
        put("resolver_type", "account_manager");
    }

    public G8a(2DM r302) {
        this.A00 = 2;
        put("params", r302.toString());
    }

    public G8a(Cursor cursor, int i, int i2, int i3) {
        this.A00 = 12;
        put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, cursor.getString(i));
        put("profile_pic_url", cursor.getString(i2));
        put("resolver_type", "content_provider");
        put("upsell_holdout_status", i3 != -1 ? cursor.getString(i3) : "FXAccountItemHoldoutStatusNoData");
    }

    public G8a(JSONObject jSONObject, int i) {
        String str;
        String str2;
        this.A00 = i;
        String str3 = PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        switch (i) {
            case 6:
                str = jSONObject.getString(str3);
                break;
            case 7:
                put(str3, jSONObject.getString(str3));
                put("profile_pic_url", jSONObject.getString("profile_pic_url"));
                str3 = "resolver_type";
                str = "content_provider";
                break;
            case 8:
            default:
                str2 = "";
                put(str3, jSONObject.has(str3) ? jSONObject.getString(str3) : str2);
                put("profile_pic_url", jSONObject.has("profilePicUrl") ? jSONObject.getString("profilePicUrl") : "");
                str3 = "resolver_type";
                str = "account_manager";
                break;
            case 9:
                put(str3, jSONObject.getString(str3));
                put("profile_pic_url", jSONObject.getString("pic_square"));
                str3 = "resolver_type";
                str = "content_provider";
                break;
        }
        put(str3, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (r302 == null) goto L16;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0063 A[RETURN] */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ boolean containsKey(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r303 = r0
            r0 = r303
            switch(r0) {
                case 1: goto L4e;
                case 2: goto L6f;
                case 3: goto L48;
                case 4: goto L6f;
                case 5: goto L56;
                case 6: goto L65;
                case 7: goto L65;
                case 8: goto L65;
                case 9: goto L65;
                case 10: goto L65;
                case 11: goto L65;
                case 12: goto L65;
                case 13: goto L56;
                default: goto L48;
            }
        L48:
            r0 = r301
            r1 = r302
            boolean r0 = super.containsKey(r1)
            return r0
        L4e:
            r0 = r302
            boolean r0 = r0 instanceof java.lang.Integer
            r303 = r0
            goto L5f
        L56:
            r0 = r302
            if (r0 == 0) goto L69
            r0 = r302
            boolean r0 = r0 instanceof X.67T
            r303 = r0
        L5f:
            r0 = r303
            if (r0 != 0) goto L69
            r0 = 0
            return r0
        L65:
            r0 = r302
            if (r0 != 0) goto L6f
        L69:
            r0 = r301
            r1 = r302
            boolean r0 = super.containsKey(r1)
            return r0
        L6f:
            r0 = r302
            boolean r0 = r0 instanceof java.lang.String
            r303 = r0
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G8a.containsKey(java.lang.Object):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if (r302 == null) goto L20;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0077 A[RETURN] */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ boolean containsValue(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r303 = r0
            r0 = r303
            switch(r0) {
                case 1: goto L62;
                case 2: goto L83;
                case 3: goto L48;
                case 4: goto L5a;
                case 5: goto L6a;
                case 6: goto L79;
                case 7: goto L79;
                case 8: goto L79;
                case 9: goto L79;
                case 10: goto L79;
                case 11: goto L79;
                case 12: goto L79;
                case 13: goto L4e;
                default: goto L48;
            }
        L48:
            r0 = r301
            r1 = r302
            boolean r0 = super.containsValue(r1)
            return r0
        L4e:
            r0 = r302
            if (r0 == 0) goto L7d
            r0 = r302
            boolean r0 = r0 instanceof X.GJx
            r303 = r0
            goto L73
        L5a:
            r0 = r302
            boolean r0 = r0 instanceof X.C3li
            r303 = r0
            goto L73
        L62:
            r0 = r302
            boolean r0 = r0 instanceof java.lang.Integer
            r303 = r0
            goto L73
        L6a:
            r0 = r302
            if (r0 == 0) goto L7d
            r0 = r302
            boolean r0 = r0 instanceof X.C67Z
            r303 = r0
        L73:
            r0 = r303
            if (r0 != 0) goto L7d
            r0 = 0
            return r0
        L79:
            r0 = r302
            if (r0 != 0) goto L83
        L7d:
            r0 = r301
            r1 = r302
            boolean r0 = super.containsValue(r1)
            return r0
        L83:
            r0 = r302
            boolean r0 = r0 instanceof java.lang.String
            r303 = r0
            goto L73
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G8a.containsValue(java.lang.Object):boolean");
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set entrySet() {
        switch (this.A00) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return super.entrySet();
            case 3:
            default:
                return super.entrySet();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (r302 == null) goto L16;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0063 A[RETURN] */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r303 = r0
            r0 = r303
            switch(r0) {
                case 1: goto L4e;
                case 2: goto L6f;
                case 3: goto L48;
                case 4: goto L6f;
                case 5: goto L56;
                case 6: goto L65;
                case 7: goto L65;
                case 8: goto L65;
                case 9: goto L65;
                case 10: goto L65;
                case 11: goto L65;
                case 12: goto L65;
                case 13: goto L56;
                default: goto L48;
            }
        L48:
            r0 = r301
            r1 = r302
            java.lang.Object r0 = super.get(r1)
            return r0
        L4e:
            r0 = r302
            boolean r0 = r0 instanceof java.lang.Integer
            r303 = r0
            goto L5f
        L56:
            r0 = r302
            if (r0 == 0) goto L69
            r0 = r302
            boolean r0 = r0 instanceof X.67T
            r303 = r0
        L5f:
            r0 = r303
            if (r0 != 0) goto L69
            r0 = 0
            return r0
        L65:
            r0 = r302
            if (r0 != 0) goto L6f
        L69:
            r0 = r301
            r1 = r302
            java.lang.Object r0 = super.get(r1)
            return r0
        L6f:
            r0 = r302
            boolean r0 = r0 instanceof java.lang.String
            r303 = r0
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G8a.get(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
    
        if (r302 == null) goto L4;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0073  */
    @Override // java.util.HashMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object getOrDefault(java.lang.Object r302, java.lang.Object r303) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r304 = r0
            r0 = r304
            switch(r0) {
                case 1: goto L6a;
                case 2: goto L62;
                case 3: goto L48;
                case 4: goto L62;
                case 5: goto L4f;
                case 6: goto L5b;
                case 7: goto L5b;
                case 8: goto L5b;
                case 9: goto L5b;
                case 10: goto L5b;
                case 11: goto L5b;
                case 12: goto L5b;
                case 13: goto L4f;
                default: goto L48;
            }
        L48:
            r0 = r301
            r1 = r302
            r2 = r303
            java.lang.Object r0 = super.getOrDefault(r1, r2)
            return r0
        L4f:
            r0 = r302
            if (r0 == 0) goto L48
            r0 = r302
            boolean r0 = r0 instanceof X.67T
            r304 = r0
            goto L6f
        L5b:
            r0 = r302
            if (r0 != 0) goto L62
            goto L48
        L62:
            r0 = r302
            boolean r0 = r0 instanceof java.lang.String
            r304 = r0
            goto L6f
        L6a:
            r0 = r302
            boolean r0 = r0 instanceof java.lang.Integer
            r304 = r0
        L6f:
            r0 = r304
            if (r0 != 0) goto L48
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G8a.getOrDefault(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set keySet() {
        switch (this.A00) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return super.keySet();
            case 3:
            default:
                return super.keySet();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (r302 == null) goto L16;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0063 A[RETURN] */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object remove(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r303 = r0
            r0 = r303
            switch(r0) {
                case 1: goto L4e;
                case 2: goto L6f;
                case 3: goto L48;
                case 4: goto L6f;
                case 5: goto L56;
                case 6: goto L65;
                case 7: goto L65;
                case 8: goto L65;
                case 9: goto L65;
                case 10: goto L65;
                case 11: goto L65;
                case 12: goto L65;
                case 13: goto L56;
                default: goto L48;
            }
        L48:
            r0 = r301
            r1 = r302
            java.lang.Object r0 = super.remove(r1)
            return r0
        L4e:
            r0 = r302
            boolean r0 = r0 instanceof java.lang.Integer
            r303 = r0
            goto L5f
        L56:
            r0 = r302
            if (r0 == 0) goto L69
            r0 = r302
            boolean r0 = r0 instanceof X.67T
            r303 = r0
        L5f:
            r0 = r303
            if (r0 != 0) goto L69
            r0 = 0
            return r0
        L65:
            r0 = r302
            if (r0 != 0) goto L6f
        L69:
            r0 = r301
            r1 = r302
            java.lang.Object r0 = super.remove(r1)
            return r0
        L6f:
            r0 = r302
            boolean r0 = r0 instanceof java.lang.String
            r303 = r0
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G8a.remove(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8 A[RETURN] */
    @Override // java.util.HashMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ boolean remove(java.lang.Object r302, java.lang.Object r303) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r304 = r0
            r0 = r304
            switch(r0) {
                case 1: goto Lb3;
                case 2: goto L9f;
                case 3: goto L48;
                case 4: goto L8b;
                case 5: goto Lca;
                case 6: goto L6f;
                case 7: goto L6f;
                case 8: goto L6f;
                case 9: goto L6f;
                case 10: goto L6f;
                case 11: goto L6f;
                case 12: goto L6f;
                case 13: goto L53;
                default: goto L48;
            }
        L48:
            r0 = r301
            r1 = r302
            r2 = r303
            boolean r0 = super.remove(r1, r2)
            r305 = r0
        L50:
            r0 = r305
            return r0
        L53:
            r0 = r302
            if (r0 == 0) goto L63
            r0 = r302
            boolean r0 = r0 instanceof X.67T
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L63
            goto Ld7
        L63:
            r0 = r303
            if (r0 == 0) goto L48
            r0 = r303
            boolean r0 = r0 instanceof X.GJx
            r304 = r0
            goto Le2
        L6f:
            r0 = r302
            if (r0 == 0) goto L7f
            r0 = r302
            boolean r0 = r0 instanceof java.lang.String
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L7f
            goto Ld7
        L7f:
            r0 = r303
            if (r0 == 0) goto L48
            r0 = r303
            boolean r0 = r0 instanceof java.lang.String
            r304 = r0
            goto Le2
        L8b:
            r0 = r302
            boolean r0 = r0 instanceof java.lang.String
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L50
            r0 = r303
            boolean r0 = r0 instanceof X.C3li
            r304 = r0
            goto Lc4
        L9f:
            r0 = r302
            boolean r0 = r0 instanceof java.lang.String
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L50
            r0 = r303
            boolean r0 = r0 instanceof java.lang.String
            r304 = r0
            goto Lc4
        Lb3:
            r0 = r302
            boolean r0 = r0 instanceof java.lang.Integer
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L50
            r0 = r303
            boolean r0 = r0 instanceof java.lang.Integer
            r304 = r0
        Lc4:
            r0 = r304
            if (r0 != 0) goto L48
            r0 = 0
            return r0
        Lca:
            r0 = r302
            if (r0 == 0) goto Ld9
            r0 = r302
            boolean r0 = r0 instanceof X.67T
            r304 = r0
            r0 = r304
            if (r0 != 0) goto Ld9
        Ld7:
            r0 = 0
            return r0
        Ld9:
            r0 = r303
            if (r0 == 0) goto L48
            r0 = r303
            boolean r0 = r0 instanceof X.C67Z
            r304 = r0
        Le2:
            r0 = r304
            if (r0 != 0) goto L48
            goto Ld7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G8a.remove(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        switch (this.A00) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return super.size();
            case 3:
            default:
                return super.size();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection values() {
        switch (this.A00) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return super.values();
            case 3:
            default:
                return super.values();
        }
    }
}
