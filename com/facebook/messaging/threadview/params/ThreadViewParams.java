package com.facebook.messaging.threadview.params;

import X.1BK;
import X.4YU;
import X.5SW;
import X.82M;
import X.C53v;
import X.C6el;
import X.C6en;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.cowatch.launcher.parameters.CoWatchLauncherParams;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.List;

/* loaded from: ThreadViewParams.class */
public final class ThreadViewParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(94);
    public long A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final CoWatchLauncherParams A04;
    public final ThreadKey A05;
    public final NavigationTrigger A06;
    public final MessageDeepLinkInfo A07;
    public final ThreadAndMaybeMessage A08;
    public final ThreadPreviewParams A09;
    public final ThreadViewMessagesInitParams A0A;
    public final C6en A0B;
    public final 5SW A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final List A0N;
    public final List A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;

    public ThreadViewParams(C6el c6el) {
        ThreadKey threadKey = c6el.A05;
        threadKey.getClass();
        this.A05 = threadKey;
        this.A0A = c6el.A0A;
        5SW r0 = c6el.A0C;
        r0.getClass();
        this.A0C = r0;
        this.A06 = c6el.A06;
        this.A07 = c6el.A07;
        this.A04 = c6el.A04;
        this.A02 = c6el.A01;
        this.A0W = c6el.A0W;
        this.A0X = c6el.A0X;
        this.A03 = c6el.A02;
        this.A0R = c6el.A0R;
        this.A0Q = c6el.A0Q;
        this.A0S = c6el.A0S;
        this.A0T = c6el.A0T;
        this.A0B = c6el.A0B;
        this.A0P = c6el.A0P;
        this.A0D = c6el.A0D;
        this.A09 = c6el.A09;
        this.A08 = c6el.A08;
        this.A0V = c6el.A0V;
        this.A0L = c6el.A0L;
        this.A0M = c6el.A0M;
        this.A00 = c6el.A03;
        this.A0U = c6el.A0U;
        this.A01 = c6el.A00;
        this.A0E = c6el.A0E;
        this.A0F = c6el.A0F;
        this.A0G = c6el.A0G;
        this.A0I = c6el.A0I;
        this.A0H = c6el.A0H;
        this.A0J = c6el.A0J;
        this.A0K = c6el.A0K;
        this.A0O = c6el.A0O;
        this.A0N = c6el.A0N;
    }

    public ThreadViewParams(Parcel parcel) {
        this.A05 = (ThreadKey) parcel.readParcelable(ThreadKey.class.getClassLoader());
        this.A0A = (ThreadViewMessagesInitParams) parcel.readParcelable(ThreadViewMessagesInitParams.class.getClassLoader());
        5SW readSerializable = parcel.readSerializable();
        readSerializable.getClass();
        this.A0C = readSerializable;
        this.A06 = (NavigationTrigger) parcel.readParcelable(NavigationTrigger.class.getClassLoader());
        this.A07 = (MessageDeepLinkInfo) parcel.readParcelable(MessageDeepLinkInfo.class.getClassLoader());
        this.A04 = (CoWatchLauncherParams) parcel.readParcelable(CoWatchLauncherParams.class.getClassLoader());
        this.A02 = parcel.readInt();
        this.A0W = C53v.A0S(parcel);
        this.A0X = C53v.A0S(parcel);
        this.A03 = parcel.readLong();
        this.A0R = C53v.A0S(parcel);
        this.A0Q = C53v.A0S(parcel);
        this.A0S = C53v.A0S(parcel);
        this.A0T = C53v.A0S(parcel);
        this.A0B = (C6en) parcel.readSerializable();
        this.A0P = C53v.A0S(parcel);
        this.A0D = parcel.readString();
        this.A09 = (ThreadPreviewParams) parcel.readParcelable(ThreadPreviewParams.class.getClassLoader());
        this.A08 = (ThreadAndMaybeMessage) parcel.readParcelable(ThreadAndMaybeMessage.class.getClassLoader());
        this.A0V = C53v.A0S(parcel);
        this.A0L = parcel.readString();
        this.A0M = parcel.readString();
        this.A00 = parcel.readLong();
        this.A0U = C53v.A0S(parcel);
        this.A01 = parcel.readInt();
        this.A0E = parcel.readString();
        this.A0F = parcel.readString();
        this.A0G = parcel.readString();
        this.A0I = parcel.readString();
        this.A0H = parcel.readString();
        this.A0J = parcel.readString();
        this.A0K = parcel.readString();
        this.A0O = parcel.readArrayList(String.class.getClassLoader());
        this.A0N = parcel.readArrayList(String.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof ThreadViewParams)) {
                return false;
            }
            ThreadViewParams threadViewParams = (ThreadViewParams) obj;
            if (Objects.equal(this.A05, threadViewParams.A05) && Objects.equal(this.A0A, threadViewParams.A0A) && this.A0C == threadViewParams.A0C && Objects.equal(this.A06, threadViewParams.A06) && Objects.equal(this.A07, threadViewParams.A07) && Objects.equal(this.A04, threadViewParams.A04) && Objects.equal(Integer.valueOf(this.A02), Integer.valueOf(threadViewParams.A02)) && 4YU.A1a(Boolean.valueOf(this.A0W), threadViewParams.A0W) && this.A0X == threadViewParams.A0X && this.A03 == threadViewParams.A03 && this.A0R == threadViewParams.A0R && this.A0Q == threadViewParams.A0Q && this.A0S == threadViewParams.A0S && this.A0T == threadViewParams.A0T && this.A0B == threadViewParams.A0B && this.A0P == threadViewParams.A0P && this.A0D == threadViewParams.A0D && Objects.equal(this.A09, threadViewParams.A09) && Objects.equal(this.A08, threadViewParams.A08) && 4YU.A1a(Boolean.valueOf(this.A0V), threadViewParams.A0V) && Objects.equal(this.A0L, threadViewParams.A0L) && Objects.equal(this.A0M, threadViewParams.A0M) && Objects.equal(Long.valueOf(this.A00), Long.valueOf(threadViewParams.A00)) && 4YU.A1a(Boolean.valueOf(this.A0U), threadViewParams.A0U) && Objects.equal(Integer.valueOf(this.A01), Integer.valueOf(threadViewParams.A01)) && Objects.equal(this.A0E, threadViewParams.A0E) && Objects.equal(this.A0F, threadViewParams.A0F) && Objects.equal(this.A0G, threadViewParams.A0G) && Objects.equal(this.A0I, threadViewParams.A0I) && Objects.equal(this.A0H, threadViewParams.A0H) && Objects.equal(this.A0J, threadViewParams.A0J) && Objects.equal(this.A0K, threadViewParams.A0K) && Objects.equal(this.A0O, threadViewParams.A0O) && Objects.equal(this.A0N, threadViewParams.A0N)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        Object[] objArr = new Object[33];
        System.arraycopy(new Object[]{this.A0I, this.A0H, this.A0J, this.A0K, this.A0O, this.A0N}, 1BK.A1W(new Object[]{this.A05, this.A0A, this.A0C, this.A06, this.A07, this.A04, Integer.valueOf(this.A02), Boolean.valueOf(this.A0W), Boolean.valueOf(this.A0X), Long.valueOf(this.A03), Boolean.valueOf(this.A0R), Boolean.valueOf(this.A0Q), Boolean.valueOf(this.A0S), Boolean.valueOf(this.A0T), this.A0B, Boolean.valueOf(this.A0P), this.A0D, this.A09, this.A08, Boolean.valueOf(this.A0V), this.A0L, this.A0M, Long.valueOf(this.A00), Integer.valueOf(this.A01), this.A0E, this.A0F, this.A0G}, objArr) ? 1 : 0, objArr, 27, 6);
        return Arrays.hashCode(objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A0A, i);
        parcel.writeSerializable(this.A0C);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A07, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A0W ? 1 : 0);
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeSerializable(this.A0B);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeString(this.A0D);
        parcel.writeParcelable(this.A09, i);
        parcel.writeParcelable(this.A08, i);
        parcel.writeInt(this.A0V ? 1 : 0);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A0M);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0K);
        parcel.writeList(this.A0O);
        parcel.writeList(this.A0N);
    }
}
