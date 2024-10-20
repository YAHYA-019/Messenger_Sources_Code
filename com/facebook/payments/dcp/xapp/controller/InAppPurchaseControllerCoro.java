package com.facebook.payments.dcp.xapp.controller;

import X.02J;
import X.03W;
import X.03Y;
import X.04R;
import X.0DR;
import X.0DT;
import X.0KU;
import X.0QD;
import X.0S2;
import X.0fH;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BL;
import X.1Kd;
import X.1Lm;
import X.2JX;
import X.2Jd;
import X.2Jf;
import X.2aI;
import X.2aK;
import X.4YU;
import X.4YV;
import X.7rL;
import X.7xQ;
import X.7yG;
import X.7yH;
import X.7yI;
import X.8Lq;
import X.9YI;
import X.9rC;
import X.A1p;
import X.A1q;
import X.AJf;
import X.ARW;
import X.AZb;
import X.AnonymousClass001;
import X.BvM;
import X.C0ty;
import X.C1790AsO;
import X.C1A3;
import X.C3O0;
import X.C3sa;
import X.C50f;
import X.C50j;
import X.C50k;
import X.C50m;
import X.C50n;
import X.C50o;
import X.C50q;
import X.C50r;
import X.C50s;
import X.C50u;
import X.C50w;
import X.C7Zk;
import X.C7lg;
import X.C7sU;
import X.C7yu;
import X.D45;
import X.DLc;
import X.Dq0;
import X.DqC;
import X.E5m;
import X.ENg;
import X.EPP;
import X.ETw;
import X.EXD;
import X.Ezn;
import X.FHZ;
import X.FmF;
import X.GCx;
import X.K75;
import X.Ke5;
import X.KlM;
import X.L1w;
import X.LSn;
import X.LSr;
import android.app.Activity;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.payments.dcp.xapp.cache.InAppPurchaseQuoteCache;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONObject;

/* loaded from: InAppPurchaseControllerCoro.class */
public final class InAppPurchaseControllerCoro implements C50u, C50w {
    public DqC A00;
    public AZb A01;
    public WeakReference A02;
    public List A03;
    public Map A04 = 04R.A0G();
    public final C50n A05;
    public final C7Zk A06;
    public final C50o A07;
    public final C50f A08;
    public final C50m A09;
    public final C50r A0A;
    public final InAppPurchaseQuoteCache A0B;
    public final C50q A0C;
    public final C50s A0D;
    public final DLc A0E;
    public final 2aI A0F;

    public InAppPurchaseControllerCoro(C50n c50n, C7Zk c7Zk, C50o c50o, C50f c50f, C50m c50m, C50r c50r, InAppPurchaseQuoteCache inAppPurchaseQuoteCache, C50q c50q, C50s c50s, 2aI r311) {
        this.A09 = c50m;
        this.A05 = c50n;
        this.A07 = c50o;
        this.A0C = c50q;
        this.A0A = c50r;
        this.A08 = c50f;
        this.A0D = c50s;
        this.A06 = c7Zk;
        this.A0E = new DLc(c50n, c50f, c50m);
        this.A0F = r311;
        this.A0B = inAppPurchaseQuoteCache;
    }

    public static final Activity A00(InAppPurchaseControllerCoro inAppPurchaseControllerCoro) {
        WeakReference weakReference = inAppPurchaseControllerCoro.A02;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, X.7sU] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.7sU] */
    public static C7sU A01(Purchase purchase, Number number) {
        String A02 = purchase.A02();
        11T.A0A(A02);
        int intValue = number.intValue();
        ?? obj = new Object();
        obj.A00 = 0;
        obj.A01 = 0;
        obj.A02 = A02;
        obj.A00 = intValue;
        7rL A00 = obj.A00();
        ?? obj2 = new Object();
        obj2.A00 = 0;
        obj2.A01 = 0;
        obj2.A02 = A00.A02;
        obj2.A00 = A00.A00;
        obj2.A01 = A00.A01;
        obj2.A03 = A00.A03;
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0396 A[LOOP:1: B:38:0x0388->B:40:0x0396, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A02(com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r301, X.DqC r302, java.util.Map r303, X.0DR r304) {
        /*
            Method dump skipped, instructions count: 1311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A02(com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro, X.DqC, java.util.Map, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015c A[LOOP:1: B:31:0x014e->B:33:0x015c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005b  */
    /* JADX WARN: Type inference failed for: r0v101, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r0v96, types: [java.util.AbstractCollection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A03(com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r301, java.lang.String r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A03(com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro, java.lang.String, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.L1w, java.lang.Object] */
    public static final Object A04(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, String str, 0DR r303, boolean z) {
        C7yu c7yu = inAppPurchaseControllerCoro.A0E.A01;
        if (c7yu == null) {
            ?? obj = new Object();
            obj.A00 = 2;
            obj.A01 = "";
            return 1BK.A1G((Object) obj, C0ty.A00);
        }
        if (str == null) {
            throw AnonymousClass001.A0L("Product type must be set");
        }
        Ke5 ke5 = new Ke5(str);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 0KU.A01;
        0KU r0 = new 0KU(0DT.A02(r303));
        c7yu.CaY(new 9rC(inAppPurchaseControllerCoro, r0), ke5, z);
        return r0.A00();
    }

    public static final LinkedHashMap A05(List list, List list2) {
        LinkedHashMap A0G;
        LinkedHashMap A0G2;
        7xQ r0 = 7xQ.A00;
        if (list != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            for (Object obj : list) {
                if (((String) obj).length() > 0) {
                    A0s.add(obj);
                }
            }
            A0G = new LinkedHashMap(4YV.A01(A0s));
            for (Object obj2 : A0s) {
                A0G.put(obj2, r0.invoke(obj2));
            }
        } else {
            A0G = 04R.A0G();
        }
        if (list2 != null) {
            ArrayList A0s2 = AnonymousClass001.A0s();
            for (Object obj3 : list2) {
                if (((String) obj3).length() > 0) {
                    A0s2.add(obj3);
                }
            }
            A0G2 = new LinkedHashMap(4YV.A01(A0s2));
            for (Object obj4 : A0s2) {
                A0G2.put(obj4, r0.invoke(obj4));
            }
        } else {
            A0G2 = 04R.A0G();
        }
        return 04R.A07(A0G, A0G2);
    }

    public static final List A06(List list) {
        11T.A0F(list, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Purchase) obj).A02.optInt("purchaseState", 1) != 4) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List A07(List list) {
        11T.A0F(list, 0);
        ArrayList A0z = 1BL.A0z(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0z.add(C7lg.A00((Purchase) it.next()));
        }
        return A0z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r302 == null) goto L6;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.Kgp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r307v3, types: [X.Kgp, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.03Y A08(java.util.List r301, java.util.List r302, boolean r303, boolean r304) {
        /*
            java.lang.String r0 = "inapp"
            r305 = r0
            r0 = r304
            if (r0 == 0) goto L6e
            java.lang.String r0 = "subs"
            r306 = r0
            r0 = r302
            if (r0 != 0) goto L14
        L10:
            X.0ty r0 = X.C0ty.A00
            r302 = r0
        L14:
            r0 = r302
            java.util.ArrayList r0 = X.1BK.A17(r0)
            r307 = r0
            X.Kgp r0 = new X.Kgp
            r308 = r0
            r0 = r308
            r0.<init>()
            r0 = r308
            r1 = r306
            r0.A00 = r1
            r0 = r308
            r1 = r307
            r0.A01 = r1
            r0 = r303
            if (r0 == 0) goto L68
            r0 = r304
            if (r0 == 0) goto L68
            r0 = r301
            if (r0 != 0) goto L42
            X.0ty r0 = X.C0ty.A00
            r301 = r0
        L42:
            r0 = r301
            java.util.ArrayList r0 = X.1BK.A17(r0)
            r306 = r0
            X.Kgp r0 = new X.Kgp
            r307 = r0
            r0 = r307
            r0.<init>()
            r0 = r307
            r1 = r305
            r0.A00 = r1
            r0 = r307
            r1 = r306
            r0.A01 = r1
        L60:
            r0 = r308
            r1 = r307
            X.03Y r0 = X.1BK.A1G(r0, r1)
            return r0
        L68:
            r0 = 0
            r307 = r0
            goto L60
        L6e:
            r0 = r305
            r306 = r0
            r0 = r301
            if (r0 == 0) goto L10
            r0 = r301
            r302 = r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A08(java.util.List, java.util.List, boolean, boolean):X.03Y");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v45, types: [X.KlM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r312v0, types: [java.lang.Object, X.7sU] */
    public static final void A09(Activity activity, Purchase purchase, SkuDetails skuDetails, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, Integer num, String str) {
        String str2;
        C7sU c7sU;
        if (activity != null) {
            ArrayList arrayList = null;
            ?? obj = new Object();
            obj.A00 = 0;
            obj.A01 = 0;
            obj.A04 = true;
            if (purchase == null || num == null) {
                str2 = str;
                c7sU = obj;
            } else {
                JSONObject jSONObject = purchase.A02;
                str2 = jSONObject.optString("obfuscatedAccountId");
                String optString = jSONObject.optString("obfuscatedProfileId");
                if (str2 == null && optString == null) {
                    str2 = null;
                }
                c7sU = A01(purchase, num);
            }
            String str3 = str != null ? str : null;
            String str4 = str2 != null ? str2 : null;
            if (skuDetails != null) {
                arrayList = AnonymousClass001.A0s();
                arrayList.add(skuDetails);
            }
            C7Zk c7Zk = inAppPurchaseControllerCoro.A06;
            c7Zk.A01("payment_init");
            c7Zk.A01("android_launch_payment_start");
            C7yu c7yu = inAppPurchaseControllerCoro.A0E.A01;
            if (c7yu != 0) {
                if (arrayList == null || arrayList.isEmpty()) {
                    throw AnonymousClass001.A0L("Details of the products must be provided.");
                }
                if (arrayList.contains(null)) {
                    throw AnonymousClass001.A0L("SKU cannot be null.");
                }
                if (arrayList.size() > 1) {
                    JSONObject jSONObject2 = ((SkuDetails) arrayList.get(0)).A00;
                    String optString2 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList.get(i);
                        if (!optString2.equals("play_pass_subs") && !skuDetails2.A00.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE).equals("play_pass_subs") && !optString2.equals(skuDetails2.A00.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE))) {
                            throw AnonymousClass001.A0L("SKUs should have the same type.");
                        }
                    }
                    String optString3 = jSONObject2.optString("packageName");
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList.get(i2);
                        if (!optString2.equals("play_pass_subs") && !skuDetails3.A00.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE).equals("play_pass_subs") && !optString3.equals(skuDetails3.A00.optString("packageName"))) {
                            throw AnonymousClass001.A0L("All SKUs must have the same package name.");
                        }
                    }
                }
                ?? obj2 = new Object();
                ((KlM) obj2).A05 = ((SkuDetails) arrayList.get(0)).A00.optString("packageName").isEmpty() ? false : true;
                ((KlM) obj2).A02 = str4;
                ((KlM) obj2).A03 = str3;
                ((KlM) obj2).A00 = c7sU.A00();
                ((KlM) obj2).A04 = 1BK.A17(arrayList);
                ((KlM) obj2).A01 = K75.A00();
                c7yu.BXo(activity, obj2, new FmF(inAppPurchaseControllerCoro));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v79, types: [X.KlM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r311v0, types: [java.lang.Object, X.7sU] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A0A(android.app.Activity r301, com.android.billingclient.api.Purchase r302, com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r303, X.ETw r304, java.lang.Integer r305, java.lang.String r306, java.lang.String r307) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A0A(android.app.Activity, com.android.billingclient.api.Purchase, com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro, X.ETw, java.lang.Integer, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0B(L1w l1w, 7yG r302, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, List list, List list2) {
        ArrayList A1E = C1A3.A1E(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Ezn ezn = (Ezn) it.next();
            C1790AsO c1790AsO = null;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (11T.A0O(((C1790AsO) next).A01, ezn.A00)) {
                        c1790AsO = next;
                        break;
                    }
                }
                c1790AsO = c1790AsO;
            }
            A1E.add(EXD.A00(ezn, c1790AsO));
        }
        Iterator it3 = A1E.iterator();
        while (it3.hasNext()) {
            A0I(inAppPurchaseControllerCoro, (ETw) it3.next());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(4YV.A01(A1E));
        Iterator it4 = A1E.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            linkedHashMap.put(((ETw) next2).A04(), next2);
        }
        r302.CHG(l1w, (ENg) null, linkedHashMap);
        C50m c50m = inAppPurchaseControllerCoro.A09;
        ArrayList A1E2 = C1A3.A1E(list);
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            String str = ((Ezn) it5.next()).A00;
            11T.A0A(str);
            A1E2.add(str);
        }
        c50m.A0B(inAppPurchaseControllerCoro.A0E.A00(), A1E2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0C(L1w l1w, 7yG r302, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0E((SkuDetails) it.next(), inAppPurchaseControllerCoro);
        }
        ArrayList A1E = C1A3.A1E(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            SkuDetails skuDetails = (SkuDetails) it2.next();
            C1790AsO c1790AsO = null;
            if (list2 != null) {
                Iterator it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (11T.A0O(((C1790AsO) next).A01, skuDetails.A00.optString("productId"))) {
                        c1790AsO = next;
                        break;
                    }
                }
                c1790AsO = c1790AsO;
            }
            11T.A0F(skuDetails, 0);
            A1E.add(new E5m(skuDetails, c1790AsO));
        }
        Iterator it4 = A1E.iterator();
        while (it4.hasNext()) {
            A0I(inAppPurchaseControllerCoro, (ETw) it4.next());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(4YV.A01(A1E));
        Iterator it5 = A1E.iterator();
        while (it5.hasNext()) {
            Object next2 = it5.next();
            linkedHashMap.put(((ETw) next2).A04(), next2);
        }
        r302.CHG(l1w, (ENg) null, linkedHashMap);
        C50m c50m = inAppPurchaseControllerCoro.A09;
        ArrayList A1E2 = C1A3.A1E(list);
        Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            String optString = ((SkuDetails) it6.next()).A00.optString("productId");
            11T.A0A(optString);
            A1E2.add(optString);
        }
        c50m.A0B(inAppPurchaseControllerCoro.A0E.A00(), A1E2);
    }

    public static final void A0D(L1w l1w, 7yI r302, List list) {
        LinkedHashMap linkedHashMap;
        if (list != null) {
            linkedHashMap = new LinkedHashMap(4YV.A01(list));
            for (Object obj : list) {
                String optString = ((SkuDetails) obj).A00.optString("productId");
                11T.A0A(optString);
                linkedHashMap.put(optString, obj);
            }
        } else {
            linkedHashMap = null;
        }
        r302.CHH(l1w, linkedHashMap);
    }

    public static final void A0E(SkuDetails skuDetails, InAppPurchaseControllerCoro inAppPurchaseControllerCoro) {
        C50q c50q = inAppPurchaseControllerCoro.A0C;
        String optString = skuDetails.A00.optString("productId");
        11T.A0A(optString);
        c50q.A00.put(optString, skuDetails);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.L1w, java.lang.Object] */
    public static final void A0F(7yG r301, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, List list) {
        ?? obj = new Object();
        obj.A00 = 5;
        obj.A01 = "";
        r301.CHG((L1w) obj, ENg.A09, 04R.A0G());
        C50m c50m = inAppPurchaseControllerCoro.A09;
        ArrayList A0z = 1BL.A0z(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0z.add(((C1790AsO) it.next()).A01);
        }
        c50m.A09(inAppPurchaseControllerCoro.A0E.A00(), "Internal billing info fetch failed", A0z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e3, code lost:
    
        if (r303.isEmpty() != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0051, code lost:
    
        if (r303.isEmpty() != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, X.ErS] */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.Object, X.ErS] */
    /* JADX WARN: Type inference failed for: r319v1 */
    /* JADX WARN: Type inference failed for: r319v2 */
    /* JADX WARN: Type inference failed for: r319v4, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r320v0 */
    /* JADX WARN: Type inference failed for: r320v1 */
    /* JADX WARN: Type inference failed for: r320v2, types: [java.util.AbstractCollection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A0G(X.7yG r301, com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r302, java.util.List r303, java.util.List r304, java.util.List r305, boolean r306) {
        /*
            Method dump skipped, instructions count: 599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A0G(X.7yG, com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro, java.util.List, java.util.List, java.util.List, boolean):void");
    }

    public static final void A0H(InAppPurchaseControllerCoro inAppPurchaseControllerCoro) {
        DLc dLc = inAppPurchaseControllerCoro.A0E;
        Dq0 dq0 = dLc.A03;
        if (dq0 != null && dq0.A00) {
            dLc.A02 = null;
        }
        inAppPurchaseControllerCoro.A01 = null;
        inAppPurchaseControllerCoro.A02 = new WeakReference(null);
    }

    public static final void A0I(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, ETw eTw) {
        C50r c50r = inAppPurchaseControllerCoro.A0A;
        String A04 = eTw.A04();
        11T.A0F(A04, 1);
        c50r.A00.put(A04, eTw);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.util.Map] */
    public static final void A0J(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, ENg eNg) {
        LinkedHashMap linkedHashMap;
        C50k c50k;
        String str;
        ENg eNg2 = ENg.A0N;
        C7Zk c7Zk = inAppPurchaseControllerCoro.A06;
        if (eNg == eNg2) {
            c7Zk.A02.flowEndCancel(c7Zk.A00, CancelReason.USER_CANCELLED);
            C50m c50m = inAppPurchaseControllerCoro.A09;
            linkedHashMap = inAppPurchaseControllerCoro.A04;
            c50k = c50m.A00;
            str = "client_execute_dcpiap_success";
        } else {
            c7Zk.A00(eNg.name());
            C50m c50m2 = inAppPurchaseControllerCoro.A09;
            String obj = eNg.toString();
            Map map = inAppPurchaseControllerCoro.A04;
            11T.A0F(obj, 0);
            linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(EPP.A0r.value, obj);
            c50k = c50m2.A00;
            str = "client_execute_dcpiap_fail";
        }
        c50k.BZX(linkedHashMap, null, str);
        AZb aZb = inAppPurchaseControllerCoro.A01;
        if (aZb != null) {
            aZb.CEq(eNg);
        }
    }

    public static final boolean A0K(String str) {
        Object obj;
        boolean z = false;
        if (str != null) {
            Integer[] A00 = 0S2.A00(4);
            int length = A00.length;
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < length) {
                    switch (A00[i2].intValue()) {
                        case 1:
                            obj = "android.test.canceled";
                            break;
                        case 2:
                            obj = "android.test.refunded";
                            break;
                        case 3:
                            obj = "android.test.item_unavailable";
                            break;
                        default:
                            obj = "android.test.purchased";
                            break;
                    }
                    if (obj.equals(str)) {
                        z = true;
                    } else {
                        i = i2 + 1;
                    }
                }
            }
        }
        return z;
    }

    public final void A0L(L1w l1w, List list) {
        11T.A0F(list, 0);
        ArrayList A0s = AnonymousClass001.A0s();
        for (Object obj : list) {
            if (((Purchase) obj).A01() != null) {
                A0s.add(obj);
            }
        }
        C50m c50m = this.A09;
        DLc dLc = this.A0E;
        String A00 = dLc.A00();
        C50q c50q = this.A0C;
        LinkedHashMap A03 = c50m.A03(c50q, A00, A0s, true);
        Iterator A1A = 1BK.A1A(A03);
        while (A1A.hasNext()) {
            c50m.A00.BZX((Map) A1A.next(), null, "client_verify_dcppayment_init");
        }
        this.A07.A01(this.A0A, c50q, new A1q(l1w, this, A0s, list, A03), dLc.A00(), ((C50j) c50m.A00).A00, A0s);
    }

    /* JADX WARN: Type inference failed for: r0v96, types: [X.L1w, java.lang.Object] */
    public void A0M(7yG r302, String str, List list, List list2, boolean z) {
        C50m c50m;
        String A00;
        String str2;
        ArrayList A0O = 0QD.A0O(list2 == null ? C0ty.A00 : list2, list == null ? C0ty.A00 : list);
        if (isEnabled()) {
            DLc dLc = this.A0E;
            if (dLc.A04) {
                LinkedHashMap A05 = A05(list, list2);
                LinkedHashMap linkedHashMap = new LinkedHashMap(02J.A00(A05.size()));
                Iterator A0x = AnonymousClass001.A0x(A05);
                while (A0x.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A0x);
                    Object key = A0z.getKey();
                    SkuDetails skuDetails = (SkuDetails) A0z.getValue();
                    11T.A0F(skuDetails, 0);
                    linkedHashMap.put(key, new E5m(skuDetails, null));
                }
                ?? obj = new Object();
                obj.A00 = 0;
                obj.A01 = "";
                r302.CHG((L1w) obj, (ENg) null, linkedHashMap);
                return;
            }
            c50m = this.A09;
            c50m.A0A(dLc.A00(), A0O);
            if (!A0O.isEmpty()) {
                04R.A0G();
                if (!11T.A0O(str, "TIER_ID")) {
                    A0G(r302, this, list, list2, null, z);
                    return;
                }
                C50o c50o = this.A07;
                BvM bvM = new BvM(r302, this, list, list2, z);
                GraphQlQueryParamSet graphQlQueryParamSet = new GraphQlQueryParamSet();
                2Jd r0 = new 2Jd(25);
                r0.A0A("product_ids", A0O);
                r0.A09("platform", "GOOGLE");
                r0.A09("product_type", 1BJ.A00(638));
                graphQlQueryParamSet.A01(r0, "input");
                2Jf r02 = new 2Jf(2JX.class, (Class) null, "FetchDCPProductQuery", (String) null, "fbandroid", 573419568, 0, 915194801L, 915194801L, false, true);
                r02.A00 = graphQlQueryParamSet;
                C3sa A002 = C3sa.A00(r02);
                4YU.A1J(A002, 585961146399395L);
                if (C50f.A00(c50o)) {
                    A002.A06 = 0S2.A0Y;
                }
                1Kd.A0F(new D45(bvM, 9), C50o.A00(A002, c50o), c50o.A04);
                return;
            }
            A00 = dLc.A00();
            str2 = "No skus to query";
        } else {
            c50m = this.A09;
            A00 = this.A0E.A00();
            str2 = "IAP is not enabled";
        }
        c50m.A09(A00, str2, A0O);
    }

    public void A0N(9YI r302, List list, List list2, Map map) {
        LinkedHashMap linkedHashMap;
        if (list.isEmpty()) {
            this.A09.A08(ENg.A05, null, null);
            return;
        }
        if (!isEnabled()) {
            if (r302 != null) {
                A0J(r302.A00, ENg.A04);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.A09.A08(ENg.A02, ((Purchase) it.next()).A01(), null);
            }
            return;
        }
        if (list2 != null) {
            linkedHashMap = new LinkedHashMap(4YV.A01(list2));
            for (Object obj : list2) {
                linkedHashMap.put(((8Lq) obj).A04, obj);
            }
        } else {
            linkedHashMap = null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Purchase purchase = (Purchase) it2.next();
            Map map2 = map != null ? (Map) map.get(purchase.A02()) : null;
            C50m c50m = this.A09;
            String A01 = purchase.A01();
            Map map3 = map2;
            if (map2 == null) {
                map3 = 04R.A0G();
            }
            LinkedHashMap A06 = 04R.A06(map3);
            if (A01 != null) {
                A06.put(EPP.A0U.value, A01);
            }
            c50m.A00.BZX(A06, null, "client_create_dcp_external_confirm_init");
            if (linkedHashMap != null) {
                8Lq r0 = (8Lq) linkedHashMap.get(purchase.A01());
                if (r0 != null) {
                    ARW arw = new ARW(13, map2, r302, r0, purchase, this);
                    if (!"AUTO_RENEW_SUBSCRIPTION".equals(r0.A03)) {
                        C7yu c7yu = this.A0E.A01;
                        if (c7yu != null) {
                            String A02 = purchase.A02();
                            11T.A0A(A02);
                            c7yu.AHg(new LSr(arw), A02, false);
                        }
                    } else if (purchase.A02.optBoolean("acknowledged", true)) {
                        c50m.A08(ENg.A05, purchase.A01(), map2);
                        if (r302 != null) {
                            r302.A00(r0);
                        }
                    } else {
                        C7yu c7yu2 = this.A0E.A01;
                        if (c7yu2 != null) {
                            String A022 = purchase.A02();
                            11T.A0A(A022);
                            c7yu2.A3o(new LSn(arw), A022, false);
                        }
                    }
                }
            }
            c50m.A05(null, null, purchase.A01(), map2);
            if (r302 != null) {
                A0J(r302.A00, ENg.A04);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0063, code lost:
    
        if (com.facebook.endtoend.EndToEnd.isRunningEndToEndTest() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x02a6, code lost:
    
        if (r0.length() != 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v129, types: [java.lang.Object, X.ErS] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, X.0CL] */
    /* JADX WARN: Type inference failed for: r0v74, types: [X.Kgp, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0O(X.DqC r302, java.util.Map r303) {
        /*
            Method dump skipped, instructions count: 1430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A0O(X.DqC, java.util.Map):void");
    }

    public final void A0P(ENg eNg, List list, Map map) {
        C50m c50m = this.A09;
        StringBuilder sb = new StringBuilder();
        sb.append("Synchronization complete: ");
        sb.append(eNg);
        0fH.A0k("DCP", sb.toString());
        c50m.A00.BZX(map, C50m.A02(list), eNg.isError ? "client_create_iap_synchronize_fail" : "client_create_iap_synchronize_success");
        C50n c50n = this.A05;
        FbUserSession fbUserSession = c50n.A01;
        Context context = c50n.A00;
        C3O0 c3o0 = (C3O0) 1Lm.A05(context, fbUserSession, 67550);
        boolean z = eNg.isError;
        c3o0.A01.A04(1BJ.A00(515), z);
        c3o0.A00 = z;
        1Lm.A05(context, fbUserSession, 67550);
        DLc dLc = this.A0E;
        Dq0 dq0 = dLc.A03;
        if (dq0 == null || !dq0.A00) {
            return;
        }
        ENg eNg2 = eNg.isError ? ENg.A0K : ENg.A0L;
        7yH r0 = dLc.A02;
        if (r0 != null) {
            r0.CL5(eNg2);
        }
    }

    public final void A0Q(List list, boolean z) {
        C50m c50m = this.A09;
        DLc dLc = this.A0E;
        String A00 = dLc.A00();
        C50q c50q = this.A0C;
        LinkedHashMap A03 = c50m.A03(c50q, A00, list, false);
        Iterator A1A = 1BK.A1A(A03);
        while (A1A.hasNext()) {
            c50m.A00.BZX((Map) A1A.next(), null, "client_verify_dcppayment_init");
        }
        this.A07.A01(this.A0A, c50q, new A1p(this, list, A03, z), dLc.A00(), ((C50j) c50m.A00).A00, list);
    }

    @Override // X.C50u
    public void BY1(Activity activity, DqC dqC, GCx gCx, AZb aZb) {
        11T.A0F(activity, 0);
        C7Zk c7Zk = this.A06;
        UserFlowLogger userFlowLogger = c7Zk.A02;
        long j = c7Zk.A00;
        userFlowLogger.flowStartIfNotOngoing(j, c7Zk.A01);
        String str = dqC.A03;
        String str2 = dqC.A07;
        DLc dLc = this.A0E;
        String A00 = dLc.A00();
        11T.A0F(str, 0);
        11T.A0F(A00, 2);
        userFlowLogger.flowAnnotate(j, "external_product_id", str);
        userFlowLogger.flowAnnotate(j, "internal_product_id", str2);
        userFlowLogger.flowAnnotate(j, "product", A00);
        c7Zk.A01("payment_native_init");
        this.A02 = new WeakReference(activity);
        this.A00 = dqC;
        this.A01 = aZb;
        C50m c50m = this.A09;
        String str3 = dqC.A03;
        String A002 = dLc.A00();
        03W r322 = dqC.A08;
        if (r322 == null) {
            r322 = 04R.A0G();
        }
        LinkedHashMap A04 = c50m.A04(str3, A002, str2, r322, false);
        this.A04 = A04;
        c50m.A00.BZX(A04, null, "client_execute_dcpiap_init");
        boolean A0K = A0K(dqC.A03);
        Map map = this.A04;
        if (A0K) {
            A0O(dqC, map);
        } else {
            2aK.A03((Integer) null, new InAppPurchaseControllerCoro$createQuoteAndPayment$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this, aZb), new AJf(this, dqC, map, null, 14), this.A0F, 2);
        }
    }

    @Override // X.C50w
    public void CEx(L1w l1w, List list) {
        ENg eNg;
        11T.A0F(l1w, 0);
        C50m c50m = this.A09;
        DqC dqC = this.A00;
        LinkedHashMap A1C = 1BK.A1C();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                String A02 = purchase.A02();
                11T.A0A(A02);
                LinkedHashMap A06 = 04R.A06(c50m.A00.B5U(l1w, purchase, false));
                if (dqC != null) {
                    A06.put(EPP.A0l.value, null);
                }
                A1C.put(A02, A06);
            }
        }
        if (l1w.A00 != 0 || list == null || list.isEmpty()) {
            DqC dqC2 = this.A00;
            int i = l1w.A00;
            eNg = ENg.A0O;
            if (i == 0) {
                eNg = ENg.A0J;
            } else if (i == 1) {
                eNg = ENg.A0N;
            } else if (i == 3) {
                eNg = ENg.A03;
            } else if (i == 7) {
                eNg = ENg.A0G;
            }
            if (dqC2 != null) {
                11T.A0A(Collections.singletonList(dqC2.A03));
            }
            if (A1C.isEmpty()) {
                LinkedHashMap A0A = 04R.A0A(new 03Y[]{1BK.A1G("extra_error_message", "Received empty list of purchases from Google")});
                if (dqC2 != null) {
                    String str = dqC2.A03;
                    String A00 = this.A0E.A00();
                    String str2 = dqC2.A07;
                    03W r319 = dqC2.A08;
                    if (r319 == null) {
                        r319 = 04R.A0G();
                    }
                    A0A.putAll(c50m.A04(str, A00, str2, r319, false));
                }
                A0A.put(EPP.A0R.value, "This error occurs when Google Billing experiences an error in their service.");
                Integer num = 4054006;
                A0A.put(EPP.A0Q.value, num.toString());
                c50m.A06(l1w, A0A);
            } else {
                Iterator A0x = AnonymousClass001.A0x(A1C);
                while (A0x.hasNext()) {
                    c50m.A06(l1w, (Map) AnonymousClass001.A0z(A0x).getValue());
                }
            }
        } else {
            DqC dqC3 = this.A00;
            if (dqC3 == null) {
                return;
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Purchase purchase2 = (Purchase) it2.next();
                Map map = (Map) A1C.get(purchase2.A02());
                if (purchase2.A02.optInt("purchaseState", 1) == 4) {
                    if (map != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                        FHZ.A02("Transaction is still pending on google", linkedHashMap);
                        c50m.A00.BZX(linkedHashMap, null, "client_create_dcppayment_fail");
                    }
                    A0J(this, ENg.A0F);
                } else if (map != null) {
                    c50m.A00.BZX(map, null, "client_create_dcppayment_success");
                }
            }
            if (!A0K(dqC3.A03)) {
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object obj : list) {
                    if (((Purchase) obj).A02.optInt("purchaseState", 1) != 4) {
                        A0s.add(obj);
                    }
                }
                A0Q(A0s, false);
                return;
            }
            A0N(null, list, null, null);
            11T.A0A(Collections.singletonList(dqC3.A03));
            eNg = ENg.A0I;
        }
        A0J(this, eNg);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b1, code lost:
    
        if (r303.isEmpty() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d1, code lost:
    
        if (r304.isEmpty() != false) goto L26;
     */
    /* JADX WARN: Type inference failed for: r0v62, types: [X.L1w, java.lang.Object] */
    @Override // X.C50u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean CaZ(X.7yI r302, java.util.List r303, java.util.List r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.CaZ(X.7yI, java.util.List, java.util.List, boolean):boolean");
    }

    @Override // X.C50u
    public boolean isEnabled() {
        DLc dLc = this.A0E;
        C7yu c7yu = dLc.A01;
        return (c7yu != null && c7yu.BVE() && dLc.A06.A01()) || dLc.A04;
    }

    @Override // X.C50u
    public void onDestroy() {
        A0H(this);
        C7yu c7yu = this.A0E.A01;
        if (c7yu != null) {
            c7yu.AQ9();
        }
    }
}
