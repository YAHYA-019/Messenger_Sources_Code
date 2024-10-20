package com.facebook.bugreporter.core.model;

import X.1Du;
import X.AbL;
import X.C53v;
import X.DKH;
import X.DKf;
import X.EPO;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.flatbuffers.Flattenable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.meta.flytrap.attachment.model.AttachmentCounter;
import com.meta.flytrap.attachment.model.BugReportAttachment;

/* loaded from: BugReport.class */
public final class BugReport implements Parcelable, Flattenable {
    public static final Parcelable.Creator CREATOR = DKf.A00(66);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public Uri A08;
    public Uri A09;
    public BugReportExtraData A0A;
    public EPO A0B;
    public ImmutableList A0C;
    public ImmutableList A0D;
    public ImmutableList A0E;
    public ImmutableMap A0F;
    public ImmutableMap A0G;
    public ImmutableMap A0H;
    public ImmutableMap A0I;
    public AttachmentCounter A0J;
    public AttachmentCounter A0K;
    public AttachmentCounter A0L;
    public AttachmentCounter A0M;
    public BugReportAttachment A0N;
    public Boolean A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public String A0k;
    public String A0l;
    public String A0m;
    public String A0n;
    public String A0o;
    public String A0p;
    public String A0q;
    public String A0r;
    public String A0s;
    public String A0t;
    public String A0u;
    public String A0v;
    public String A0w;
    public boolean A0x;
    public boolean A0y;
    public boolean A0z;
    public boolean A10;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BugReport(X.ExV r302) {
        /*
            Method dump skipped, instructions count: 891
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.bugreporter.core.model.BugReport.<init>(X.ExV):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A09, i);
        parcel.writeString(this.A0Z);
        parcel.writeParcelable(this.A08, i);
        parcel.writeString(this.A0j);
        parcel.writeString(this.A0T);
        parcel.writeString(this.A0a);
        parcel.writeString(this.A0e);
        parcel.writeString(this.A0R);
        parcel.writeString(this.A0S);
        parcel.writeString(this.A0d);
        parcel.writeString(this.A0i);
        parcel.writeString(this.A0h);
        parcel.writeSerializable(this.A0B);
        parcel.writeString(this.A0X);
        parcel.writeString(this.A0v);
        ImmutableMap immutableMap = this.A0G;
        if (immutableMap != null) {
            1Du A0g = DKH.A0g(parcel, immutableMap);
            while (A0g.hasNext()) {
                AbL.A0n(parcel, A0g);
            }
        } else {
            parcel.writeInt(0);
        }
        ImmutableMap immutableMap2 = this.A0F;
        if (immutableMap2 != null) {
            1Du A0g2 = DKH.A0g(parcel, immutableMap2);
            while (A0g2.hasNext()) {
                AbL.A0n(parcel, A0g2);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeMap(this.A0H);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A0w);
        parcel.writeString(this.A0P);
        parcel.writeInt(this.A0z ? 1 : 0);
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A0W);
        parcel.writeString(this.A0f);
        parcel.writeString(this.A0k);
        parcel.writeString(this.A0u);
        parcel.writeInt(this.A0x ? 1 : 0);
        parcel.writeString(this.A0l);
        parcel.writeString(this.A0m);
        parcel.writeString(this.A0p);
        parcel.writeString(this.A0n);
        parcel.writeString(this.A0o);
        parcel.writeLong(this.A05);
        parcel.writeParcelable(this.A0A, i);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeMap(this.A0I);
        parcel.writeString(this.A0b);
        parcel.writeString(this.A0g);
        parcel.writeString(this.A0c);
        parcel.writeString(this.A0Y);
        parcel.writeString(this.A0q);
        parcel.writeString(this.A0r);
        parcel.writeString(this.A0t);
        parcel.writeString(this.A0s);
        C53v.A0I(parcel, this.A0O);
        parcel.writeInt(this.A10 ? 1 : 0);
        parcel.writeString(this.A0U);
        parcel.writeInt(this.A0y ? 1 : 0);
        parcel.writeLong(this.A06);
        parcel.writeString(this.A0V);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A07);
        parcel.writeParcelable(this.A0J, i);
        parcel.writeParcelable(this.A0K, i);
        parcel.writeParcelable(this.A0L, i);
        parcel.writeParcelable(this.A0M, i);
        parcel.writeTypedList(this.A0C);
        parcel.writeTypedList(this.A0E);
        parcel.writeParcelable(this.A0N, i);
    }
}
