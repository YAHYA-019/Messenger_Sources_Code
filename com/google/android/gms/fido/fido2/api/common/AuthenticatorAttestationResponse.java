package com.google.android.gms.fido.fido2.api.common;

import X.0Pz;
import X.1BJ;
import X.1BK;
import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.AnonymousClass001;
import X.DKD;
import X.JQx;
import X.JQy;
import X.JR0;
import X.K64;
import X.K65;
import X.K66;
import X.K6A;
import X.K6H;
import X.K6O;
import X.K6Q;
import X.K6R;
import X.K6S;
import X.K6T;
import X.K6U;
import X.K6V;
import X.KYB;
import X.Ki5;
import X.Ki6;
import X.Kje;
import X.KoQ;
import X.LGm;
import X.Li4;
import X.Lip;
import X.Lj7;
import X.LtH;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: AuthenticatorAttestationResponse.class */
public final class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR = LGm.A00(18);
    public final Lj7 A00;
    public final Lj7 A01;
    public final Lj7 A02;
    public final String[] A03;

    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        K6O A0k = JR0.A0k(bArr);
        K6O A0k2 = JR0.A0k(bArr2);
        K6O A0k3 = JR0.A0k(bArr3);
        AbstractC00481b7.A02(A0k);
        this.A00 = A0k;
        AbstractC00481b7.A02(A0k2);
        this.A01 = A0k2;
        AbstractC00481b7.A02(A0k3);
        this.A02 = A0k3;
        AbstractC00481b7.A02(strArr);
        this.A03 = strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r312v11, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r312v12 */
    /* JADX WARN: Type inference failed for: r312v22, types: [java.util.AbstractCollection] */
    public static final Lip A01(Li4 li4, InputStream inputStream) {
        Throwable A0q;
        K66 A03;
        boolean z;
        boolean z2;
        try {
            Ki6 A05 = li4.A05();
            if (A05 == null) {
                throw new IOException("Parser being asked to parse an empty input stream");
            }
            try {
                byte b = A05.A01;
                byte b2 = A05.A00;
                int i = 0;
                if (b2 == Byte.MIN_VALUE) {
                    Li4.A02(li4, Byte.MIN_VALUE);
                    Li4.A01(li4);
                    long A00 = Li4.A00(li4);
                    if (A00 >= 0) {
                        if (A00 > 0) {
                            li4.A01.A00.push(Long.valueOf(A00));
                        }
                        if (A00 <= 1000) {
                            A02(A00, b);
                            Lip[] lipArr = new Lip[(int) A00];
                            while (i < A00) {
                                lipArr[i] = A01(li4, inputStream);
                                i++;
                            }
                            return new K6U(K65.A00(lipArr));
                        }
                        new IOException("Parser being asked to read a large CBOR array");
                    } else {
                        A0q = AnonymousClass001.A0q(String.format("the maximum supported array length is %s", Long.MAX_VALUE));
                    }
                } else if (b2 == -96) {
                    Li4.A02(li4, (byte) -96);
                    Li4.A01(li4);
                    long A002 = Li4.A00(li4);
                    if (A002 < 0 || A002 > 4611686018427387903L) {
                        A0q = AnonymousClass001.A0q("the maximum supported map length is 4611686018427387903L");
                    } else {
                        if (A002 > 0) {
                            li4.A01.A00.push(Long.valueOf(A002 + A002));
                        }
                        if (A002 <= 1000) {
                            A02(A002, b);
                            int i2 = (int) A002;
                            Ki5[] ki5Arr = new Ki5[i2];
                            Lip lip = null;
                            int i3 = 0;
                            while (true) {
                                if (i3 < A002) {
                                    Lip A01 = A01(li4, inputStream);
                                    if (lip != null && A01.compareTo(lip) <= 0) {
                                        new IOException(String.format("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s", lip.toString(), A01.toString()));
                                        break;
                                    }
                                    ki5Arr[i3] = new Ki5(A01, A01(li4, inputStream));
                                    i3++;
                                    lip = A01;
                                } else {
                                    TreeMap treeMap = new TreeMap();
                                    while (true) {
                                        if (i >= i2) {
                                            final Comparator comparator = K66.A03;
                                            Comparator comparator2 = treeMap.comparator();
                                            int i4 = 1;
                                            boolean equals = comparator2 == null ? true : comparator.equals(comparator2);
                                            Collection entrySet = treeMap.entrySet();
                                            Map.Entry[] entryArr = LtH.A01;
                                            if (!(entrySet instanceof Collection)) {
                                                Iterator it = entrySet.iterator();
                                                entrySet = AnonymousClass001.A0s();
                                                it.getClass();
                                                while (it.hasNext()) {
                                                    JQx.A1S((AbstractCollection) entrySet, it);
                                                }
                                            }
                                            Map.Entry[] entryArr2 = (Map.Entry[]) entrySet.toArray(entryArr);
                                            int length = entryArr2.length;
                                            if (length != 0) {
                                                int i5 = 0;
                                                if (length != 1) {
                                                    Object[] objArr = new Object[length];
                                                    Object[] objArr2 = new Object[length];
                                                    if (!equals) {
                                                        Arrays.sort(entryArr2, 0, length, new Comparator() { // from class: X.Ls9
                                                            @Override // java.util.Comparator
                                                            public final int compare(Object obj, Object obj2) {
                                                                Map.Entry entry = (Map.Entry) obj;
                                                                Map.Entry entry2 = (Map.Entry) obj2;
                                                                entry.getClass();
                                                                entry2.getClass();
                                                                return comparator.compare(entry.getKey(), entry2.getKey());
                                                            }
                                                        });
                                                        Map.Entry entry = entryArr2[0];
                                                        entry.getClass();
                                                        Object key = entry.getKey();
                                                        objArr[0] = key;
                                                        Object value = entry.getValue();
                                                        objArr2[0] = value;
                                                        A03(objArr[0], value);
                                                        do {
                                                            Map.Entry entry2 = entryArr2[i4 - 1];
                                                            entry2.getClass();
                                                            Map.Entry entry3 = entryArr2[i4];
                                                            entry3.getClass();
                                                            Object key2 = entry3.getKey();
                                                            Object value2 = entry3.getValue();
                                                            A03(key2, value2);
                                                            objArr[i4] = key2;
                                                            objArr2[i4] = value2;
                                                            if (comparator.compare(key, key2) != 0) {
                                                                i4++;
                                                                key = key2;
                                                            } else {
                                                                A0q = AnonymousClass001.A0L(0Pz.A0v("Multiple entries with same key: ", String.valueOf(entry2), " and ", String.valueOf(entry3)));
                                                            }
                                                        } while (i4 < length);
                                                        K6A k6a = K6A.A03;
                                                        K6H k6h = K65.A00;
                                                        new K66(new K64(objArr2, length), null, new K6A(new K64(objArr, length), comparator));
                                                    }
                                                    do {
                                                        Map.Entry entry4 = entryArr2[i5];
                                                        entry4.getClass();
                                                        Object key3 = entry4.getKey();
                                                        Object value3 = entry4.getValue();
                                                        A03(key3, value3);
                                                        objArr[i5] = key3;
                                                        objArr2[i5] = value3;
                                                        i5++;
                                                    } while (i5 < length);
                                                    K6A k6a2 = K6A.A03;
                                                    K6H k6h2 = K65.A00;
                                                    new K66(new K64(objArr2, length), null, new K6A(new K64(objArr, length), comparator));
                                                } else {
                                                    Map.Entry entry5 = entryArr2[0];
                                                    entry5.getClass();
                                                    Object key4 = entry5.getKey();
                                                    Object value4 = entry5.getValue();
                                                    K6A k6a3 = K6A.A03;
                                                    new K66(K65.A01(value4), null, new K6A(K65.A01(key4), comparator));
                                                }
                                            } else {
                                                A03 = K66.A03(comparator);
                                            }
                                            return new K6V(A03);
                                        }
                                        Ki5 ki5 = ki5Arr[i];
                                        if (treeMap.containsKey(ki5.A00)) {
                                            new IOException("Attempted to add duplicate key to canonical CBOR Map.");
                                            break;
                                        }
                                        treeMap.put(ki5.A00, ki5.A01);
                                        i++;
                                    }
                                }
                            }
                        } else {
                            new IOException("Parser being asked to read a large CBOR map");
                        }
                    }
                } else if (b2 == -64) {
                    new IOException("Tags are currently unsupported");
                } else if (b2 == -32) {
                    Li4.A02(li4, (byte) -32);
                    if (li4.A00.A01 <= 24) {
                        int A003 = (int) Li4.A00(li4);
                        if (A003 == 20) {
                            z = false;
                        } else if (A003 == 21) {
                            z = true;
                        } else {
                            A0q = JQy.A0k("expected FALSE or TRUE", new Object[0]);
                        }
                        return new K6Q(z);
                    }
                    A0q = AnonymousClass001.A0N("expected simple value");
                } else if (b2 == 0 || b2 == 32) {
                    li4.A05();
                    byte b3 = li4.A00.A00;
                    if (b3 == 0) {
                        z2 = true;
                    } else if (b3 == 32) {
                        z2 = false;
                    } else {
                        A0q = JQy.A0k("expected major type 0 or 1 but found %s", new Object[]{Integer.valueOf((b3 >> 5) & 7)});
                    }
                    long A004 = Li4.A00(li4);
                    if (A004 >= 0) {
                        if (!z2) {
                            A004 = (-1) ^ A004;
                        }
                        A02(A004 > 0 ? A004 : (-1) ^ A004, b);
                        return new K6S(A004);
                    }
                    A0q = AnonymousClass001.A0q(String.format("the maximum supported unsigned/negative integer is %s", Long.MAX_VALUE));
                } else {
                    if (b2 == 64) {
                        Li4.A02(li4, (byte) 64);
                        byte[] A04 = Li4.A04(li4);
                        int length2 = A04.length;
                        A02(length2, b);
                        return new K6R(Lj7.A01(A04, length2));
                    }
                    if (b2 == 96) {
                        Li4.A02(li4, (byte) 96);
                        String str = new String(Li4.A04(li4), StandardCharsets.UTF_8);
                        A02(str.length(), b);
                        return new K6T(str);
                    }
                    new IOException(0Pz.A0T("Unidentifiable major type: ", (b2 >> 5) & 7));
                }
                throw A0q;
            } catch (IOException | RuntimeException e) {
                throw new IOException("Error in decoding CborValue from bytes", e);
            }
        } catch (IOException e2) {
            throw new IOException("Error in decoding CborValue from bytes", e2);
        }
    }

    public static final void A02(long j, byte b) {
        switch (b) {
            case 24:
                if (j < 24) {
                    throw new IOException(0Pz.A0h("Integer value ", " after add info could have been represented in 0 additional bytes, but used 1", j));
                }
                return;
            case 25:
                if (j < 256) {
                    throw new IOException(0Pz.A0h("Integer value ", " after add info could have been represented in 0-1 additional bytes, but used 2", j));
                }
                return;
            case 26:
                if (j < OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED) {
                    throw new IOException(0Pz.A0h("Integer value ", " after add info could have been represented in 0-2 additional bytes, but used 4", j));
                }
                return;
            case 27:
                if (j < 4294967296L) {
                    throw new IOException(0Pz.A0h("Integer value ", " after add info could have been represented in 0-4 additional bytes, but used 8", j));
                }
                return;
            default:
                return;
        }
    }

    public static void A03(Object obj, Object obj2) {
        if (obj == null) {
            throw AnonymousClass001.A0Q("null key in entry: null=".concat(JQx.A0w(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        throw AnonymousClass001.A0Q(0Pz.A0j(1BJ.A00(1857), obj.toString(), "=null"));
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof AuthenticatorAttestationResponse) {
            AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
            if (AbstractC09524qc.A00(this.A00, authenticatorAttestationResponse.A00) && AbstractC09524qc.A00(this.A01, authenticatorAttestationResponse.A01)) {
                z = JR0.A1X(this.A02, authenticatorAttestationResponse.A02);
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(1BK.A1a(Integer.valueOf(DKD.A04(this.A00)), Integer.valueOf(DKD.A04(this.A01)), DKD.A04(this.A02)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.Kje] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, X.Kje] */
    public String toString() {
        String A0X = AnonymousClass001.A0X(this);
        ?? obj = new Object();
        A0X.getClass();
        KoQ koQ = KoQ.A00;
        Kje A00 = AuthenticatorResponse.A00(AuthenticatorResponse.A00(AuthenticatorResponse.A00(obj, JR0.A0r(koQ, this.A00), "keyHandle"), JR0.A0r(koQ, this.A01), PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA), JR0.A0r(koQ, this.A02), PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ);
        String arrays = Arrays.toString(this.A03);
        ?? obj2 = new Object();
        A00.A00 = obj2;
        obj2.A01 = arrays;
        obj2.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        return KYB.A00((Kje) obj, A0X);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A0B(parcel, this.A00.A04(), 2);
        AbstractC01153q8.A0B(parcel, this.A01.A04(), 3);
        AbstractC01153q8.A0B(parcel, this.A02.A04(), 4);
        String[] strArr = this.A03;
        if (strArr != null) {
            int A01 = AbstractC01153q8.A01(parcel, 5);
            parcel.writeStringArray(strArr);
            AbstractC01153q8.A03(parcel, A01);
        }
        AbstractC01153q8.A03(parcel, A0E);
    }
}
