package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.util.TriState;
import com.facebook.stickers.model.Sticker;
import com.facebook.stickers.model.StickerCapabilities;
import com.facebook.stickers.model.StickerPack;
import com.facebook.stickers.service.models.FetchStickersParams;
import com.facebook.stickers.service.models.FetchStickersResult;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.6q2, reason: invalid class name */
/* loaded from: 6q2.class */
public final class C6q2 {
    public 1BY A00;
    public final C09694qx A01 = (C09694qx) 1Bi.A03(84635);
    public final C09994s4 A04 = (C09994s4) 1Bi.A03(49324);
    public final C6q3 A02 = (C6q3) 1Bi.A03(50170);
    public final 5R0 A03 = (5R0) 1Bi.A03(82988);
    public final 5R3 A07 = (5R3) 1Bi.A03(49720);
    public final 69I A05 = (69I) 1Bn.A0E((Context) null, (1BY) null, 49970);
    public final 5Yf A06 = (5Yf) 1Hv.A02((Context) 1Bn.A0E((Context) null, (1BY) null, 83719), 84088);

    public C6q2(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [java.util.List] */
    public static FetchStickersResult A00(FbUserSession fbUserSession, C6q2 c6q2, FetchStickersParams fetchStickersParams) {
        ImmutableList immutableList;
        ImmutableList immutableList2 = fetchStickersParams.A01;
        if (immutableList2.isEmpty()) {
            immutableList = Collections.emptyList();
        } else {
            immutableList = ((FetchStickersResult) c6q2.A01.A00(c6q2.A04, null, fetchStickersParams)).A00;
            5R0 r0 = c6q2.A03;
            Iterator it = r0.A0B(immutableList2).iterator();
            while (it.hasNext()) {
                Sticker sticker = (Sticker) it.next();
                69I r02 = c6q2.A05;
                if (r02.A07(sticker) != null) {
                    C0L3.A02(AnonymousClass001.A0E(r02.A07(sticker).getPath()));
                }
                Uri uri = sticker.A01;
                if (69I.A01(uri) && uri != null) {
                    if (!69I.A01(uri)) {
                        uri = null;
                    }
                    C0L3.A02(AnonymousClass001.A0E(uri.getPath()));
                }
                if (r02.A05(sticker) != null) {
                    C0L3.A02(AnonymousClass001.A0E(r02.A05(sticker).getPath()));
                }
            }
            SQLiteDatabase AUF = c6q2.A07.AUF();
            C01m.A01(AUF, 46050498);
            try {
                SQLiteDatabase AUF2 = r0.A01.AUF();
                C01m.A01(AUF2, -1579201186);
                try {
                    4YW.A0C(AUF2, new 4sQ(PublicKeyCredentialControllerUtility.JSON_KEY_ID, immutableList2), "stickers");
                    5R0.A03(r0, immutableList2);
                    AUF2.setTransactionSuccessful();
                    C01m.A03(AUF2, 229721136);
                    r0.A0I(immutableList);
                    AUF.setTransactionSuccessful();
                    C01m.A03(AUF, 949465224);
                    ((69H) 1Lo.A04((Context) null, fbUserSession, c6q2.A00, 49969)).A0B(immutableList);
                    HashMap A0u = AnonymousClass001.A0u();
                    A02(immutableList, A0u);
                    c6q2.A01(fbUserSession, A0u);
                } catch (Throwable th) {
                    C01m.A03(AUF2, 437141234);
                    throw th;
                }
            } catch (Throwable th2) {
                C01m.A03(AUF, -1188387490);
                throw th2;
            }
        }
        return new FetchStickersResult(immutableList);
    }

    private void A01(FbUserSession fbUserSession, java.util.Map map) {
        ImmutableList A06;
        69H r0 = (69H) 1Lo.A04((Context) null, fbUserSession, this.A00, 49969);
        synchronized (r0) {
            A06 = r0.A06(false, false);
        }
        if (A06 == null) {
            try {
                A06 = this.A03.A08();
            } catch (IOException unused) {
            }
            if (A06 == null) {
                return;
            }
        }
        ArrayList arrayList = new ArrayList(A06);
        boolean z = false;
        for (int i = 0; i < arrayList.size(); i++) {
            Sticker sticker = (Sticker) arrayList.get(i);
            Object obj = map.get(sticker.A0F);
            if (obj != null && !obj.equals(sticker)) {
                arrayList.set(i, obj);
                z = true;
            }
        }
        if (z) {
            this.A03.A0J(arrayList);
            r0.A0C(arrayList);
        }
    }

    public static void A02(Collection collection, java.util.Map map) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Sticker sticker = (Sticker) it.next();
            map.put(sticker.A0F, sticker);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        if (r301.A06.A01(r302) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A03(com.facebook.stickers.model.Sticker r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 == 0) goto L5d
            r0 = r302
            com.facebook.stickers.model.StickerCapabilities r0 = r0.A0C
            r303 = r0
            r0 = r303
            boolean r0 = r0.A00()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L5d
            r0 = r301
            X.69I r0 = r0.A05
            r305 = r0
            r0 = r302
            android.net.Uri r0 = r0.A02
            r303 = r0
            r0 = r305
            r1 = r303
            boolean r0 = r0.A09(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L5d
            r0 = r302
            android.net.Uri r0 = r0.A09
            r303 = r0
            r0 = r305
            r1 = r303
            boolean r0 = r0.A09(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L5d
            r0 = r302
            android.net.Uri r0 = r0.A07
            r303 = r0
            r0 = r305
            r1 = r303
            boolean r0 = r0.A09(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L5d
            r0 = r301
            X.5Yf r0 = r0.A06
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.A01(r1)
            r304 = r0
            r0 = 0
            r306 = r0
            r0 = 0
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L60
        L5d:
            r0 = 1
            r306 = r0
        L60:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6q2.A03(com.facebook.stickers.model.Sticker):boolean");
    }

    public FetchStickersResult A04(FbUserSession fbUserSession, FetchStickersParams fetchStickersParams) {
        FetchStickersResult A00;
        int i;
        boolean z;
        C00j.A05("StickersHandler.handleFetchStickers", 1295478438);
        try {
            C6q7 c6q7 = C6q7.$redex_init_class;
            int intValue = fetchStickersParams.A02.intValue();
            if (intValue == 0) {
                A00 = A00(fbUserSession, this, fetchStickersParams);
                i = 209403045;
            } else {
                if (intValue != 1) {
                    throw AnonymousClass001.A0L("Cannot fetch stickers without operation type specified");
                }
                ImmutableList immutableList = fetchStickersParams.A01;
                LinkedHashMap linkedHashMap = new LinkedHashMap(C1my.A00(immutableList.size()));
                1BY r0 = this.A00;
                69H r02 = (69H) 1Lo.A04((Context) null, fbUserSession, r0, 49969);
                ImmutableList A05 = r02.A05(immutableList);
                A02(A05, linkedHashMap);
                HashSet hashSet = new HashSet(immutableList);
                Iterator it = A05.iterator();
                while (it.hasNext()) {
                    hashSet.remove(((Sticker) it.next()).A0F);
                }
                Integer num = 0S2.A01;
                ImmutableList copyOf = ImmutableList.copyOf((Collection) hashSet);
                Iterator it2 = A05.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    if (A03((Sticker) it2.next())) {
                        z = true;
                        break;
                    }
                }
                if (!copyOf.isEmpty() || z) {
                    5R0 r03 = this.A03;
                    A02(r03.A0B(copyOf), linkedHashMap);
                    Collection<Sticker> values = linkedHashMap.values();
                    ImmutableList.Builder builder = ImmutableList.builder();
                    if (values != null) {
                        for (Sticker sticker : values) {
                            if (!sticker.A0C.A00()) {
                                builder.m11011add((Object) sticker);
                            }
                        }
                    }
                    ImmutableList build = builder.build();
                    HashSet hashSet2 = new HashSet();
                    Iterator it3 = build.iterator();
                    while (it3.hasNext()) {
                        hashSet2.add(((Sticker) it3.next()).A0H);
                    }
                    HashMap hashMap = new HashMap();
                    Iterator it4 = hashSet2.iterator();
                    while (it4.hasNext()) {
                        String A0i = AnonymousClass001.A0i(it4);
                        StickerPack A03 = ((69H) 1Lo.A04((Context) null, fbUserSession, r0, 49969)).A03(A0i);
                        if (A03 != null) {
                            hashMap.put(A0i, A03);
                        } else {
                            try {
                                StickerPack A06 = r03.A06(A0i);
                                if (A06 != null) {
                                    hashMap.put(A0i, A06);
                                }
                            } catch (IOException unused) {
                            }
                        }
                    }
                    HashSet hashSet3 = new HashSet();
                    Iterator it5 = build.iterator();
                    while (it5.hasNext()) {
                        Sticker sticker2 = (Sticker) it5.next();
                        StickerPack stickerPack = (StickerPack) hashMap.get(sticker2.A0H);
                        if (stickerPack != null) {
                            StickerCapabilities stickerCapabilities = stickerPack.A06;
                            11T.A0F(stickerCapabilities, 0);
                            TriState triState = stickerCapabilities.A00;
                            TriState triState2 = stickerCapabilities.A01;
                            TriState triState3 = stickerCapabilities.A02;
                            TriState triState4 = stickerCapabilities.A06;
                            StickerCapabilities A01 = 7Qn.A01(triState, triState2, triState3, stickerCapabilities.A03, stickerCapabilities.A04, stickerCapabilities.A05, triState4);
                            C6q8 c6q8 = new C6q8();
                            c6q8.A02(sticker2);
                            c6q8.A03(A01);
                            hashSet3.add(c6q8.A00());
                        }
                    }
                    A02(hashSet3, linkedHashMap);
                    if (!hashSet3.isEmpty()) {
                        r03.A0I(hashSet3);
                    }
                    ArrayList arrayList = new ArrayList();
                    1Du it6 = immutableList.iterator();
                    while (it6.hasNext()) {
                        Object next = it6.next();
                        if (A03((Sticker) linkedHashMap.get(next))) {
                            arrayList.add(next);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        ImmutableList immutableList2 = ((FetchStickersResult) this.A01.A00(this.A04, null, new FetchStickersParams(num, arrayList))).A00;
                        A02(immutableList2, linkedHashMap);
                        r03.A0I(immutableList2);
                    }
                    r02.A0B(linkedHashMap.values());
                }
                A01(fbUserSession, linkedHashMap);
                ImmutableList.Builder builder2 = ImmutableList.builder();
                1Du it7 = immutableList.iterator();
                while (it7.hasNext()) {
                    Object next2 = it7.next();
                    if (linkedHashMap.containsKey(next2)) {
                        builder2.m11011add(linkedHashMap.get(next2));
                    }
                }
                new FetchStickersResult(builder2.build());
                i = -543236407;
            }
            C00j.A01(i);
            return A00;
        } catch (Throwable th) {
            C00j.A01(-1151145474);
            throw th;
        }
    }
}
