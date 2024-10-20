package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: Kqu.class */
public final class Kqu {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final Exception A0B;
    public final Exception A0C;
    public final Exception A0D;
    public final String A0E;

    public Kqu(Exception exc, Exception exc2, Exception exc3, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.A0E = str;
        this.A04 = i5;
        this.A00 = i;
        this.A06 = i7;
        this.A02 = i3;
        this.A08 = i9;
        this.A01 = i2;
        this.A07 = i8;
        this.A05 = i6;
        this.A0A = i11;
        this.A09 = i10;
        this.A03 = i4;
        this.A0C = exc2;
        this.A0B = exc;
        this.A0D = exc3;
    }

    public String toString() {
        try {
            JSONObject A12 = AnonymousClass001.A12();
            A12.put("itemTypeLoggingName", this.A0E);
            int i = this.A04;
            A12.put("numIdsToCache", i);
            A12.put("numIdsToCache", i);
            A12.put("numIdsInCondor", this.A00);
            A12.put("numMatchingIdsInCondor", this.A06);
            A12.put("numIdsInThreadsCache", this.A02);
            A12.put("numMatchingIdsInThreadsCache", this.A08);
            A12.put("numIdsInSearchCache", this.A01);
            A12.put("numMatchingIdsInSearchCache", this.A07);
            A12.put("numIdsToFetch", this.A05);
            A12.put("numResultsReceived", this.A0A);
            A12.put("numResultsParsed", this.A09);
            A12.put("numIdsMissing", this.A03);
            A12.put("fetchException", this.A0C);
            A12.put("cacheStoreException", this.A0B);
            A12.put("unknownException", this.A0D);
            String obj = A12.toString();
            11T.A0D(obj);
            return obj;
        } catch (JSONException unused) {
            return "{}";
        }
    }
}
