package X;

import android.content.Context;
import android.util.Base64;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.54p, reason: invalid class name */
/* loaded from: 54p.class */
public final class C54p extends 54X {
    public int A00;
    public final C0et A01;
    public final C54a A02;
    public final C3t8 A03;
    public final FbSharedPreferences A04;
    public final C54d A05;
    public final 5zA A06;
    public final C15h A07;
    public final C15h A08;
    public final C15h A09;
    public final C54f A0A;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C54p() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54p.<init>():void");
    }

    public static 2DM A04(FbUserSession fbUserSession, C54p c54p) {
        byte[] bArr;
        C26T c26t = C26T.A00;
        2DM A0g = 4YU.A0g(c26t);
        C6V c6v = ((C1t) 1Lo.A06(fbUserSession, 84452)).A00;
        HashSet A0v = AnonymousClass001.A0v();
        AnonymousClass001.A1J(A0v, 7);
        AnonymousClass001.A1J(A0v, 10);
        AnonymousClass001.A1J(A0v, 11);
        AnonymousClass001.A1J(A0v, 15);
        AnonymousClass001.A1J(A0v, 14);
        AnonymousClass001.A1J(A0v, 86);
        AnonymousClass001.A1J(A0v, 30);
        AnonymousClass001.A1J(A0v, 48);
        AnonymousClass001.A1J(A0v, 69);
        AnonymousClass001.A1J(A0v, 47);
        AnonymousClass001.A1J(A0v, 52);
        AnonymousClass001.A1J(A0v, 56);
        AnonymousClass001.A1J(A0v, 73);
        AnonymousClass001.A1J(A0v, 78);
        AnonymousClass001.A1J(A0v, 83);
        AnonymousClass001.A1J(A0v, 89);
        AnonymousClass001.A1J(A0v, 92);
        AnonymousClass001.A1J(A0v, 94);
        AnonymousClass001.A1J(A0v, 93);
        AnonymousClass001.A1J(A0v, 98);
        AnonymousClass001.A1J(A0v, ActionId.ABORTED);
        AnonymousClass001.A1J(A0v, ActionId.CARD_DATA_LOADED);
        AnonymousClass001.A1J(A0v, ActionId.MQTT_DISCONNECTED);
        AnonymousClass001.A1J(A0v, ActionId.MESSENGER_THREAD_LIST_LOADED);
        for (C3C c3c : c6v.A08) {
            if (c3c.A00()) {
                A0v.add(c3c.A01);
            }
        }
        AnonymousClass001.A1J(A0v, 8);
        AnonymousClass001.A1J(A0v, 17);
        AnonymousClass001.A1J(A0v, 23);
        AnonymousClass001.A1J(A0v, 20);
        AnonymousClass001.A1J(A0v, 32);
        AnonymousClass001.A1J(A0v, 24);
        AnonymousClass001.A1J(A0v, 25);
        AnonymousClass001.A1J(A0v, 26);
        AnonymousClass001.A1J(A0v, 29);
        AnonymousClass001.A1J(A0v, 28);
        AnonymousClass001.A1J(A0v, 27);
        AnonymousClass001.A1J(A0v, 34);
        AnonymousClass001.A1J(A0v, 77);
        AnonymousClass001.A1J(A0v, 91);
        AnonymousClass001.A1J(A0v, 82);
        AnonymousClass001.A1J(A0v, 54);
        AnonymousClass001.A1J(A0v, 55);
        AnonymousClass001.A1J(A0v, 57);
        1BY r0 = c6v.A00;
        if (1Br.A07(((C5yd) 1Bn.A0E((Context) null, r0, 67808)).A01).AZk(36313669314878282L)) {
            AnonymousClass001.A1J(A0v, 90);
        }
        AnonymousClass001.A1J(A0v, ActionId.VIEW_DID_LOAD_BEGIN);
        2yD A07 = 1Br.A07(((5qK) 1Bn.A0E((Context) null, r0, 83854)).A00);
        1GD r02 = 1GD.A07;
        if (A07.AZr(r02, 36315361531994944L)) {
            AnonymousClass001.A1J(A0v, 99);
        }
        c6v.A07.get();
        if (1BK.A0N(c6v.A04).AZk(2342158057213075889L) && 1Br.A07(((HU7) c6v.A06.get()).A00).AZk(36311581961817105L)) {
            AnonymousClass001.A1J(A0v, 70);
        }
        AnonymousClass001.A1J(A0v, 61);
        AnonymousClass001.A1J(A0v, 65);
        AnonymousClass001.A1J(A0v, 63);
        AnonymousClass001.A1J(A0v, 64);
        AnonymousClass001.A1J(A0v, 84);
        AnonymousClass001.A1J(A0v, 67);
        1Bn.A0E((Context) null, r0, 82076);
        if (C60t.A00((C60t) 1Bn.A0E((Context) null, r0, 68017)).AZk(36313892653374622L)) {
            AnonymousClass001.A1J(A0v, 95);
        }
        if (C5yc.A00((C5yc) 1Bi.A03(66467)).AZk(2342158710048695623L)) {
            AnonymousClass001.A1J(A0v, 100);
        }
        AnonymousClass001.A1J(A0v, ActionId.LEGACY_MARKER);
        AnonymousClass001.A1J(A0v, ActionId.ACTION_BAR_COMPLETE);
        if (((C5yj) c6v.A05.get()).A00()) {
            AnonymousClass001.A1J(A0v, ActionId.RTMP_CONNECTION_RELEASE);
        }
        Blv blv = (Blv) c6v.A01.get();
        if (!blv.A00.A0A() && blv.A01.AZr(r02, 2342159770905029093L)) {
            AnonymousClass001.A1J(A0v, ActionId.RTMP_PACKET_RECEIVED);
        }
        AnonymousClass001.A1J(A0v, ActionId.QUERY_READY);
        AnonymousClass001.A1J(A0v, ActionId.RTMP_STREAM_PREPARED);
        if (((C2bq) c6v.A03.get()).A00()) {
            AnonymousClass001.A1J(A0v, ActionId.RTMP_CONNECTION_CONNECTED);
        }
        Iterator it = A0v.iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            if (c6v.A00(number.intValue()) == null) {
                1BK.A09(c6v.A02).D0v("ClientOnlyDeltas", AnonymousClass001.A0Z(number, "No handler for client-only delta type: ", AnonymousClass001.A0k()));
                it.remove();
            }
        }
        if (A0v.isEmpty()) {
            bArr = new byte[0];
        } else {
            int A03 = (AnonymousClass001.A03(Collections.max(A0v)) / 8) + 1;
            bArr = new byte[A03];
            Iterator it2 = A0v.iterator();
            while (it2.hasNext()) {
                int A032 = AnonymousClass001.A03(it2.next());
                int i = (A03 - (A032 / 8)) - 1;
                bArr[i] = (byte) ((1 << (A032 % 8)) | bArr[i]);
            }
        }
        A0g.A0o("client_delta_sync_bitmask", Base64.encodeToString(bArr, 3));
        24X r310 = (2DM) A0g.A0D("graphql_query_hashes");
        if (r310 == null) {
            r310 = 4YU.A0g(c26t);
            A0g.A0e(r310, "graphql_query_hashes");
        }
        24X r313 = (2DM) A0g.A0D("graphql_query_params");
        if (r313 == null) {
            r313 = 4YU.A0g(c26t);
            A0g.A0e(r313, "graphql_query_params");
        }
        r310.A0o("xma_query_id", ConstantsKt.CAMERA_ID_FRONT);
        2DM A0g2 = 4YU.A0g(c26t);
        A0g2.A0o("xma_id", "<ID>");
        C54a c54a = c54p.A02;
        int A08 = c54a.A08();
        int A06 = c54a.A06();
        int A00 = C54a.A00(c54a);
        int A002 = C54a.A00(c54a);
        A0g2.A0i("small_preview_width", A08 * 2);
        A0g2.A0i("small_preview_height", A08);
        A0g2.A0i("large_preview_width", A06 * 2);
        A0g2.A0i("large_preview_height", A06);
        A0g2.A0i(AbE.A00(175), A00);
        A0g2.A0i("full_screen_height", A002);
        A0g2.A0h("blur", c54p.A06.A00.A05("semi_free_messenger_placeholder") ? 50.0f : 0.0f);
        2DM A0g3 = 4YU.A0g(c26t);
        A0g3.A0o("styles_id", "7ad8ec94377d7d1c913d0eeccdae8db7");
        A0g3.A0g(AbstractC00603o4.A00(277), C3t8.A03);
        A0g2.A0e(A0g3, "nt_context");
        A0g2.A0p("use_oss_id", true);
        A0g2.A0o("client_doc_id", 2tS.A01("fbandroid").createClientDocIdForQueryNameHash(2226725815L));
        r313.A0e(A0g2, ConstantsKt.CAMERA_ID_FRONT);
        return A0g;
    }
}
