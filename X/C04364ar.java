package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4ar, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4ar.class */
public class C04364ar implements InterfaceC04374as {
    public 2rC A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final 2DI A04;
    public final 2IU A05;
    public final C2r8 A06;
    public final 2Dp A07;
    public final Object A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final java.util.Map A0C;
    public static final Set A0E = C03793z2.A00(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "uri_source");
    public static final Object A0D = new Object();

    public C04364ar(2rC r302, 2DI r303, 2IU r304, C2r8 c2r8, 2Dp r306, Object obj, String str, String str2, boolean z, boolean z2) {
        this.A07 = r306;
        this.A09 = str;
        HashMap hashMap = new HashMap();
        this.A0C = hashMap;
        hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        hashMap.put("uri_source", r306 == null ? "null-request" : r306.A05);
        this.A0A = str2;
        this.A05 = r304;
        this.A08 = obj == null ? A0D : obj;
        this.A06 = c2r8;
        this.A03 = z;
        this.A00 = r302;
        this.A02 = z2;
        this.A01 = false;
        this.A0B = new ArrayList();
        this.A04 = r303;
    }

    public static void A00(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((4bA) it.next()).A01();
            }
        }
    }

    public static void A01(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((4bA) it.next()).A02();
            }
        }
    }

    public static void A02(List list) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((4bA) it.next()).A03();
            }
        }
    }

    public void A03() {
        AbstractCollection abstractCollection;
        synchronized (this) {
            if (this.A01) {
                abstractCollection = null;
            } else {
                this.A01 = true;
                new ArrayList(this.A0B);
            }
        }
        if (abstractCollection != null) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                ((4bA) it.next()).A00();
            }
        }
    }

    @Override // X.InterfaceC04374as
    public void A5P(4bA r302) {
        boolean z;
        synchronized (this) {
            this.A0B.add(r302);
            z = this.A01;
        }
        if (z) {
            r302.A00();
        }
    }

    public Object AlI(String str) {
        return this.A0C.get(str);
    }

    public Object AlJ(String str, Object obj) {
        Object obj2 = this.A0C.get(str);
        return obj2 == null ? obj : obj2;
    }

    public java.util.Map AlR() {
        return this.A0C;
    }

    @Override // X.InterfaceC04374as
    public 2rC B4s() {
        2rC r0;
        synchronized (this) {
            r0 = this.A00;
        }
        return r0;
    }

    @Override // X.InterfaceC04374as
    public boolean BTd() {
        boolean z;
        synchronized (this) {
            z = this.A02;
        }
        return z;
    }

    @Override // X.InterfaceC04374as
    public boolean BV1() {
        boolean z;
        synchronized (this) {
            z = this.A03;
        }
        return z;
    }

    public void Ca9(String str, Object obj) {
        if (A0E.contains(str)) {
            return;
        }
        this.A0C.put(str, obj);
    }

    public void CaA(java.util.Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Ca9((String) entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // X.InterfaceC04374as
    public void CaJ(String str, String str2) {
        java.util.Map map = this.A0C;
        map.put("origin", str);
        map.put("origin_sub", str2);
    }
}
