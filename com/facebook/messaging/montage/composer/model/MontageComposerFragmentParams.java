package com.facebook.messaging.montage.composer.model;

import X.11T;
import X.1BK;
import X.1BL;
import X.4YU;
import X.82M;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C00m;
import X.C04v;
import X.C0s8;
import X.C0ty;
import X.C53v;
import X.C5wh;
import X.C6r6;
import X.C6x1;
import X.C6x3;
import X.C6x4;
import X.C6x5;
import X.C6x7;
import X.C6x8;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.media.mediapicker.mediapickerenvironment.MediaPickerEnvironment;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.RegularImmutableSet;
import java.util.Collection;
import java.util.List;

/* loaded from: MontageComposerFragmentParams.class */
public final class MontageComposerFragmentParams extends C04v implements Parcelable {
    public static final 82M CREATOR = new 82M(55);
    public Uri A00;
    public MediaPickerEnvironment A01;
    public Message A02;
    public Message A03;
    public ThreadKey A04;
    public ThreadSummary A05;
    public C6x4 A06;
    public CameraPreviewConfig A07;
    public C6x7 A08;
    public C6x1 A09;
    public C6x3 A0A;
    public MentionReshareModel A0B;
    public C6x5 A0C;
    public C6r6 A0D;
    public RollCallCameraModel A0E;
    public MediaResource A0F;
    public C5wh A0G;
    public ImmutableList A0H;
    public ImmutableList A0I;
    public ImmutableList A0J;
    public ImmutableMap A0K;
    public ImmutableSet A0L;
    public Integer A0M;
    public Integer A0N;
    public Integer A0O;
    public Integer A0P;
    public String A0Q;
    public String A0R;
    public C00m A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;

    /* loaded from: MontageComposerFragmentParams$Builder.class */
    public final class Builder implements Parcelable {
        public static final Parcelable.Creator CREATOR = new 82M(54);
        public Uri A00;
        public MediaPickerEnvironment A01;
        public Message A02;
        public Message A03;
        public ThreadKey A04;
        public ThreadSummary A05;
        public C6x4 A06;
        public CameraPreviewConfig A07;
        public C6x7 A08;
        public MentionReshareModel A0B;
        public C6x5 A0C;
        public C6r6 A0D;
        public RollCallCameraModel A0E;
        public MediaResource A0F;
        public C5wh A0G;
        public ImmutableList A0H;
        public ImmutableMap A0I;
        public ImmutableSet A0J;
        public Integer A0K;
        public Integer A0L;
        public Integer A0M;
        public Integer A0N;
        public String A0O;
        public String A0P;
        public List A0Q;
        public C00m A0S;
        public boolean A0T;
        public boolean A0U;
        public boolean A0V;
        public boolean A0W;
        public boolean A0X;
        public boolean A0Y;
        public boolean A0a;
        public boolean A0Z = true;
        public C6x1 A09 = C6x1.A05;
        public C6x3 A0A = C6x3.A04;
        public List A0R = C0ty.A00;

        public Builder() {
            C6x4 c6x4 = C6x4.A05;
            this.A06 = c6x4;
            this.A0Q = C0s8.A14(c6x4, C6x4.A0A);
            this.A0C = C6x5.A02;
            MediaPickerEnvironment mediaPickerEnvironment = MediaPickerEnvironment.A0O;
            11T.A0B(mediaPickerEnvironment);
            this.A01 = mediaPickerEnvironment;
            RegularImmutableSet regularImmutableSet = RegularImmutableSet.A05;
            11T.A0A(regularImmutableSet);
            this.A0J = regularImmutableSet;
            this.A08 = C6x7.A03;
            this.A0T = true;
            ImmutableList of = ImmutableList.of();
            11T.A0A(of);
            this.A0H = of;
            this.A0S = C6x8.A00;
            this.A0G = C5wh.A09;
            ImmutableMap immutableMap = RegularImmutableMap.A03;
            11T.A0A(immutableMap);
            this.A0I = immutableMap;
        }

        /* JADX WARN: Type inference failed for: r0v94, types: [com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams, java.lang.Object] */
        public final MontageComposerFragmentParams A00() {
            boolean z = this.A0X;
            boolean z2 = this.A0Y;
            boolean z3 = this.A0Z;
            boolean z4 = this.A0a;
            C6x1 c6x1 = this.A09;
            ImmutableList copyOf = ImmutableList.copyOf((Collection) this.A0R);
            11T.A0A(copyOf);
            C6x4 c6x4 = this.A06;
            ImmutableList copyOf2 = ImmutableList.copyOf((Collection) this.A0Q);
            11T.A0A(copyOf2);
            C6x3 c6x3 = this.A0A;
            C6x5 c6x5 = this.A0C;
            MediaPickerEnvironment mediaPickerEnvironment = this.A01;
            MediaResource mediaResource = this.A0F;
            Message message = this.A03;
            C6r6 c6r6 = this.A0D;
            if (c6r6 == null) {
                throw 1BK.A0h();
            }
            ThreadKey threadKey = this.A04;
            String str = this.A0P;
            boolean z5 = this.A0V;
            Uri uri = this.A00;
            MentionReshareModel mentionReshareModel = this.A0B;
            boolean z6 = this.A0U;
            ThreadSummary threadSummary = this.A05;
            String str2 = this.A0O;
            Message message2 = this.A02;
            ImmutableSet immutableSet = this.A0J;
            C6x7 c6x7 = this.A08;
            RollCallCameraModel rollCallCameraModel = this.A0E;
            CameraPreviewConfig cameraPreviewConfig = this.A07;
            Integer num = this.A0L;
            Integer num2 = this.A0N;
            Integer num3 = this.A0M;
            Integer num4 = this.A0K;
            boolean z7 = this.A0T;
            ImmutableList immutableList = this.A0H;
            boolean z8 = this.A0W;
            C00m c00m = this.A0S;
            C5wh c5wh = this.A0G;
            ImmutableMap immutableMap = this.A0I;
            11T.A0F(c6x1, 5);
            11T.A0F(c6x4, 7);
            11T.A0F(c6x3, 9);
            11T.A0F(c6x5, 10);
            11T.A0F(mediaPickerEnvironment, 11);
            11T.A0F(immutableSet, 24);
            11T.A0F(c6x7, 25);
            11T.A0F(immutableList, 33);
            11T.A0F(c00m, 35);
            11T.A0F(c5wh, 36);
            11T.A0F(immutableMap, 37);
            ?? obj = new Object();
            obj.A0X = z;
            obj.A0Y = z2;
            obj.A0Z = z3;
            obj.A0a = z4;
            obj.A09 = c6x1;
            obj.A0I = copyOf;
            obj.A06 = c6x4;
            obj.A0H = copyOf2;
            obj.A0A = c6x3;
            obj.A0C = c6x5;
            obj.A01 = mediaPickerEnvironment;
            obj.A0F = mediaResource;
            obj.A03 = message;
            obj.A0D = c6r6;
            obj.A04 = threadKey;
            obj.A0R = str;
            obj.A0V = z5;
            obj.A00 = uri;
            obj.A0B = mentionReshareModel;
            obj.A0U = z6;
            obj.A05 = threadSummary;
            obj.A0Q = str2;
            obj.A02 = message2;
            obj.A0L = immutableSet;
            obj.A08 = c6x7;
            obj.A0E = rollCallCameraModel;
            obj.A07 = cameraPreviewConfig;
            obj.A0N = num;
            obj.A0P = num2;
            obj.A0O = num3;
            obj.A0M = num4;
            obj.A0T = z7;
            obj.A0J = immutableList;
            obj.A0W = z8;
            obj.A0S = c00m;
            obj.A0G = c5wh;
            obj.A0K = immutableMap;
            return obj;
        }

        public final void A01(MontageComposerFragmentParams montageComposerFragmentParams) {
            11T.A0F(montageComposerFragmentParams, 0);
            this.A0C = montageComposerFragmentParams.A0C;
            this.A0D = montageComposerFragmentParams.A0D;
            this.A0X = montageComposerFragmentParams.A0X;
            this.A0Y = montageComposerFragmentParams.A0Y;
            this.A0Z = montageComposerFragmentParams.A0Z;
            this.A0a = montageComposerFragmentParams.A0a;
            this.A09 = montageComposerFragmentParams.A09;
            this.A0R = 1BL.A0a(montageComposerFragmentParams.A0I);
            this.A06 = montageComposerFragmentParams.A06;
            this.A0Q = 1BL.A0a(montageComposerFragmentParams.A0H);
            this.A01 = montageComposerFragmentParams.A01;
            this.A0F = montageComposerFragmentParams.A0F;
            this.A03 = montageComposerFragmentParams.A03;
            this.A04 = montageComposerFragmentParams.A04;
            this.A0P = montageComposerFragmentParams.A0R;
            this.A0V = montageComposerFragmentParams.A0V;
            this.A0A = montageComposerFragmentParams.A0A;
            this.A00 = montageComposerFragmentParams.A00;
            this.A0B = montageComposerFragmentParams.A0B;
            this.A0U = montageComposerFragmentParams.A0U;
            this.A05 = montageComposerFragmentParams.A05;
            this.A0O = montageComposerFragmentParams.A0Q;
            this.A02 = montageComposerFragmentParams.A02;
            this.A0J = montageComposerFragmentParams.A0L;
            this.A08 = montageComposerFragmentParams.A08;
            this.A0E = montageComposerFragmentParams.A0E;
            this.A07 = montageComposerFragmentParams.A07;
            this.A0G = montageComposerFragmentParams.A0G;
            this.A0I = montageComposerFragmentParams.A0K;
        }

        public final void A02(ImmutableSet immutableSet) {
            if (immutableSet == null) {
                immutableSet = RegularImmutableSet.A05;
                11T.A0A(immutableSet);
            }
            this.A0J = immutableSet;
        }

        public final void A03(List list) {
            11T.A0F(list, 0);
            this.A0Q = list;
        }

        public final void A04(List list) {
            11T.A0F(list, 0);
            this.A0R = list;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            C53v.A0J(parcel, this.A0C);
            C53v.A0J(parcel, this.A0D);
            parcel.writeInt(this.A0X ? 1 : 0);
            parcel.writeInt(this.A0Y ? 1 : 0);
            parcel.writeInt(this.A0Z ? 1 : 0);
            parcel.writeInt(this.A0a ? 1 : 0);
            C53v.A0J(parcel, this.A09);
            ImmutableList.Builder A0h = 4YU.A0h();
            A0h.addAll(this.A0R);
            C53v.A0C(parcel, A0h.build());
            C53v.A0J(parcel, this.A06);
            ImmutableList.Builder A0h2 = 4YU.A0h();
            A0h2.addAll(this.A0Q);
            C53v.A0C(parcel, A0h2.build());
            parcel.writeParcelable(this.A01, i);
            parcel.writeParcelable(this.A0F, i);
            parcel.writeParcelable(this.A03, i);
            parcel.writeParcelable(this.A04, i);
            parcel.writeString(this.A0P);
            parcel.writeInt(this.A0V ? 1 : 0);
            C53v.A0J(parcel, this.A0A);
            parcel.writeParcelable(this.A00, i);
            parcel.writeParcelable(this.A0B, i);
            parcel.writeInt(this.A0U ? 1 : 0);
            parcel.writeParcelable(this.A05, i);
            parcel.writeString(this.A0O);
            parcel.writeParcelable(this.A02, i);
            C53v.A0C(parcel, this.A0J.asList());
            C53v.A0J(parcel, this.A08);
            parcel.writeParcelable(this.A0E, i);
            parcel.writeParcelable(this.A07, i);
            parcel.writeInt(this.A0T ? 1 : 0);
            parcel.writeList(this.A0H);
            parcel.writeInt(this.A0W ? 1 : 0);
            C53v.A0J(parcel, this.A0G);
            ImmutableMap immutableMap = this.A0I;
            immutableMap.getClass();
            parcel.writeMap(immutableMap);
        }
    }

    public final Builder A00() {
        Builder builder = new Builder();
        C6x5 c6x5 = this.A0C;
        if (c6x5 == null) {
            c6x5 = C6x5.A02;
        }
        builder.A0C = c6x5;
        builder.A0D = this.A0D;
        builder.A0X = this.A0X;
        builder.A0Y = this.A0Y;
        builder.A0Z = this.A0Z;
        C6x1 c6x1 = this.A09;
        if (c6x1 == null) {
            c6x1 = C6x1.A05;
        }
        builder.A09 = c6x1;
        builder.A04(this.A0I);
        C6x4 c6x4 = this.A06;
        if (c6x4 == null) {
            c6x4 = C6x4.A04;
        }
        builder.A06 = c6x4;
        builder.A03(this.A0H);
        MediaPickerEnvironment mediaPickerEnvironment = this.A01;
        if (mediaPickerEnvironment == null) {
            mediaPickerEnvironment = MediaPickerEnvironment.A0O;
            11T.A0B(mediaPickerEnvironment);
        }
        builder.A01 = mediaPickerEnvironment;
        builder.A0F = this.A0F;
        builder.A03 = this.A03;
        builder.A04 = this.A04;
        builder.A0P = this.A0R;
        builder.A0V = this.A0V;
        C6x3 c6x3 = this.A0A;
        if (c6x3 == null) {
            c6x3 = C6x3.A04;
        }
        builder.A0A = c6x3;
        builder.A00 = this.A00;
        builder.A0B = this.A0B;
        builder.A0U = this.A0U;
        builder.A05 = this.A05;
        builder.A0O = this.A0Q;
        builder.A02 = this.A02;
        builder.A02(this.A0L);
        C6x7 c6x7 = this.A08;
        11T.A0F(c6x7, 0);
        builder.A08 = c6x7;
        builder.A0E = this.A0E;
        builder.A07 = this.A07;
        builder.A0L = this.A0N;
        builder.A0N = this.A0P;
        builder.A0M = this.A0O;
        builder.A0K = this.A0M;
        builder.A0T = this.A0T;
        ImmutableList immutableList = this.A0J;
        11T.A0F(immutableList, 0);
        builder.A0H = immutableList;
        builder.A0W = this.A0W;
        C00m c00m = this.A0S;
        11T.A0F(c00m, 0);
        builder.A0S = c00m;
        C5wh c5wh = this.A0G;
        11T.A0F(c5wh, 0);
        builder.A0G = c5wh;
        ImmutableMap immutableMap = this.A0K;
        11T.A0F(immutableMap, 0);
        builder.A0I = immutableMap;
        return builder;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageComposerFragmentParams)) {
                return false;
            }
            MontageComposerFragmentParams montageComposerFragmentParams = (MontageComposerFragmentParams) obj;
            if (this.A0X != montageComposerFragmentParams.A0X || this.A0Y != montageComposerFragmentParams.A0Y || this.A0Z != montageComposerFragmentParams.A0Z || this.A0a != montageComposerFragmentParams.A0a || this.A09 != montageComposerFragmentParams.A09 || !11T.A0O(this.A0I, montageComposerFragmentParams.A0I) || this.A06 != montageComposerFragmentParams.A06 || !11T.A0O(this.A0H, montageComposerFragmentParams.A0H) || this.A0A != montageComposerFragmentParams.A0A || this.A0C != montageComposerFragmentParams.A0C || !11T.A0O(this.A01, montageComposerFragmentParams.A01) || !11T.A0O(this.A0F, montageComposerFragmentParams.A0F) || !11T.A0O(this.A03, montageComposerFragmentParams.A03) || this.A0D != montageComposerFragmentParams.A0D || !11T.A0O(this.A04, montageComposerFragmentParams.A04) || !11T.A0O(this.A0R, montageComposerFragmentParams.A0R) || this.A0V != montageComposerFragmentParams.A0V || !11T.A0O(this.A00, montageComposerFragmentParams.A00) || !11T.A0O(this.A0B, montageComposerFragmentParams.A0B) || this.A0U != montageComposerFragmentParams.A0U || !11T.A0O(this.A05, montageComposerFragmentParams.A05) || !11T.A0O(this.A0Q, montageComposerFragmentParams.A0Q) || !11T.A0O(this.A02, montageComposerFragmentParams.A02) || !11T.A0O(this.A0L, montageComposerFragmentParams.A0L) || this.A08 != montageComposerFragmentParams.A08 || !11T.A0O(this.A0E, montageComposerFragmentParams.A0E) || !11T.A0O(this.A07, montageComposerFragmentParams.A07) || !11T.A0O(this.A0N, montageComposerFragmentParams.A0N) || !11T.A0O(this.A0P, montageComposerFragmentParams.A0P) || !11T.A0O(this.A0O, montageComposerFragmentParams.A0O) || !11T.A0O(this.A0M, montageComposerFragmentParams.A0M) || this.A0T != montageComposerFragmentParams.A0T || !11T.A0O(this.A0J, montageComposerFragmentParams.A0J) || this.A0W != montageComposerFragmentParams.A0W || !11T.A0O(this.A0S, montageComposerFragmentParams.A0S) || this.A0G != montageComposerFragmentParams.A0G || !11T.A0O(this.A0K, montageComposerFragmentParams.A0K)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A0K, AnonymousClass002.A05(this.A0G, AnonymousClass002.A05(this.A0S, (AnonymousClass002.A05(this.A0J, (((((((((((((AnonymousClass002.A05(this.A08, AnonymousClass002.A05(this.A0L, (((((((((((((((((AnonymousClass002.A05(this.A0D, (((AnonymousClass002.A05(this.A01, AnonymousClass002.A05(this.A0C, AnonymousClass002.A05(this.A0A, AnonymousClass002.A05(this.A0H, AnonymousClass002.A05(this.A06, AnonymousClass002.A05(this.A0I, AnonymousClass002.A05(this.A09, ((((((AnonymousClass002.A00(this.A0X ? 1 : 0) * 31) + AnonymousClass002.A00(this.A0Y ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0Z ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0a ? 1 : 0)) * 31))))))) + AnonymousClass001.A02(this.A0F)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + 1BL.A05(this.A0R)) * 31) + AnonymousClass002.A00(this.A0V ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A00)) * 31) + AnonymousClass001.A02(this.A0B)) * 31) + AnonymousClass002.A00(this.A0U ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A05)) * 31) + 1BL.A05(this.A0Q)) * 31) + AnonymousClass001.A02(this.A02)) * 31)) + AnonymousClass001.A02(this.A0E)) * 31) + AnonymousClass001.A02(this.A07)) * 31) + AnonymousClass001.A02(this.A0N)) * 31) + AnonymousClass001.A02(this.A0P)) * 31) + AnonymousClass001.A02(this.A0O)) * 31) + 4YU.A03(this.A0M)) * 31) + AnonymousClass002.A00(this.A0T ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0W ? 1 : 0)) * 31)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        C53v.A0J(parcel, this.A0C);
        C53v.A0J(parcel, this.A0D);
        parcel.writeInt(this.A0X ? 1 : 0);
        parcel.writeInt(this.A0Y ? 1 : 0);
        parcel.writeInt(this.A0Z ? 1 : 0);
        parcel.writeInt(this.A0a ? 1 : 0);
        C53v.A0J(parcel, this.A09);
        C53v.A0C(parcel, ImmutableList.copyOf((Collection) this.A0I));
        C53v.A0J(parcel, this.A06);
        C53v.A0C(parcel, ImmutableList.copyOf((Collection) this.A0H));
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A0F, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A0R);
        parcel.writeInt(this.A0V ? 1 : 0);
        C53v.A0J(parcel, this.A0A);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A0B, i);
        parcel.writeInt(this.A0U ? 1 : 0);
        parcel.writeParcelable(this.A05, i);
        parcel.writeString(this.A0Q);
        parcel.writeParcelable(this.A02, i);
        C53v.A0C(parcel, this.A0L.asList());
        C53v.A0J(parcel, this.A08);
        parcel.writeParcelable(this.A0E, i);
        parcel.writeParcelable(this.A07, i);
        C53v.A0K(parcel, this.A0N);
        C53v.A0K(parcel, this.A0P);
        C53v.A0K(parcel, this.A0O);
        C53v.A0K(parcel, this.A0M);
        parcel.writeInt(this.A0T ? 1 : 0);
        parcel.writeList(this.A0J);
        parcel.writeInt(this.A0W ? 1 : 0);
        C53v.A0J(parcel, this.A0G);
        ImmutableMap immutableMap = this.A0K;
        immutableMap.getClass();
        parcel.writeMap(immutableMap);
    }
}
