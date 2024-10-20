package com.facebook.messaging.montage.model.art;

import X.02W;
import X.1BK;
import X.1BL;
import X.1Du;
import X.1JF;
import X.2yD;
import X.4YU;
import X.4YV;
import X.AbM;
import X.AnonymousClass001;
import X.C23u;
import X.C53v;
import X.CST;
import X.DKG;
import X.FH3;
import X.FJ8;
import X.GOn;
import X.H9C;
import X.HC2;
import X.HCR;
import X.Hpi;
import X.I0h;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.cameracore.ardelivery.model.AREffectAsyncAsset;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.EffectAssetType;
import com.facebook.expression.effect.interactive.metadata.InteractiveEffectMetadata;
import com.facebook.graphql.enums.GraphQLInspirationsCaptureMode;
import com.facebook.messaging.montage.model.montageattribution.MontageAttributionData;
import com.facebook.messaging.montage.model.previewvideo.EffectVideoPreviewData;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: EffectItem.class */
public final class EffectItem extends BaseItem {
    public static final Parcelable.Creator CREATOR = CST.A00(7);
    public ImmutableMap A00;
    public final double A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final Uri A09;
    public final Uri A0A;
    public final Uri A0B;
    public final Uri A0C;
    public final Hpi A0D;
    public final ARRequestAsset.CompressionMethod A0E;
    public final InteractiveEffectMetadata A0F;
    public final H9C A0G;
    public final EffectMetaData A0H;
    public final MontageAttributionData A0I;
    public final EffectVideoPreviewData A0J;
    public final ImmutableList A0K;
    public final ImmutableList A0L;
    public final ImmutableList A0M;
    public final ImmutableList A0N;
    public final ImmutableMap A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;
    public final String A0d;
    public final String A0e;
    public final String A0f;
    public final String A0g;
    public final String A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final boolean A0v;
    public final boolean A0w;
    public final boolean A0x;
    public final boolean A0y;
    public final boolean A0z;
    public final boolean A10;
    public final boolean A11;
    public final boolean A12;
    public final boolean A13;
    public final boolean A14;
    public final ImmutableList A15;

    public EffectItem(I0h i0h) {
        String str = i0h.A0r;
        HC2 hc2 = i0h.A0I;
        Uri uri = i0h.A0D;
        Uri uri2 = i0h.A0A;
        String str2 = i0h.A0n;
        String str3 = i0h.A0o;
        HCR hcr = i0h.A0L;
        String str4 = i0h.A0q;
        String str5 = i0h.A0p;
        super.A09 = str;
        super.A03 = hc2;
        super.A02 = uri;
        super.A01 = uri2;
        super.A05 = str2;
        super.A06 = str3;
        super.A04 = hcr;
        super.A08 = str4;
        super.A07 = str5;
        this.A0C = i0h.A0E;
        this.A09 = i0h.A08;
        this.A0o = i0h.A0y;
        this.A0p = i0h.A0z;
        this.A0G = i0h.A0J;
        this.A0X = i0h.A0c;
        this.A0T = i0h.A0Y;
        this.A0U = i0h.A0Z;
        this.A0W = i0h.A0b;
        this.A0d = i0h.A0i;
        this.A0a = i0h.A0f;
        this.A0g = i0h.A0l;
        this.A0D = i0h.A0F;
        this.A0L = i0h.A0P;
        this.A0M = i0h.A0Q;
        this.A0f = i0h.A0k;
        this.A0e = i0h.A0j;
        this.A0F = i0h.A0H;
        this.A0h = i0h.A0m;
        this.A0c = i0h.A0h;
        this.A07 = i0h.A06;
        this.A08 = i0h.A07;
        this.A0E = i0h.A0G;
        this.A0N = i0h.A0R;
        this.A0K = i0h.A0O;
        this.A0H = i0h.A0K;
        this.A0Y = i0h.A0d;
        this.A0R = i0h.A0W;
        this.A0l = i0h.A0v;
        this.A0O = i0h.A0S;
        this.A00 = i0h.A0T;
        this.A0u = i0h.A14;
        this.A0v = i0h.A15;
        this.A10 = i0h.A1A;
        this.A0w = i0h.A16;
        this.A14 = i0h.A1E;
        this.A11 = i0h.A1B;
        this.A12 = i0h.A1C;
        this.A13 = i0h.A1D;
        this.A0z = i0h.A19;
        this.A0y = i0h.A18;
        this.A0x = i0h.A17;
        this.A0S = i0h.A0X;
        this.A0m = i0h.A0w;
        this.A01 = i0h.A00;
        this.A02 = i0h.A01;
        this.A0b = i0h.A0g;
        this.A0I = i0h.A0M;
        this.A15 = A00();
        this.A0J = i0h.A0N;
        this.A0i = i0h.A0s;
        this.A0s = i0h.A12;
        this.A0r = i0h.A11;
        this.A0q = i0h.A10;
        this.A0k = i0h.A0u;
        this.A0j = i0h.A0t;
        this.A0t = i0h.A13;
        this.A0Z = i0h.A0e;
        this.A0V = i0h.A0a;
        this.A06 = i0h.A05;
        super.A00 = i0h.A09;
        this.A0n = i0h.A0x;
        this.A0P = i0h.A0U;
        this.A0A = i0h.A0B;
        this.A0Q = i0h.A0V;
        this.A05 = i0h.A04;
        this.A04 = i0h.A03;
        this.A03 = i0h.A02;
        this.A0B = i0h.A0C;
    }

    public EffectItem(Uri uri, Uri uri2, Uri uri3, Uri uri4, ARRequestAsset.CompressionMethod compressionMethod, InteractiveEffectMetadata interactiveEffectMetadata, H9C h9c, HCR hcr, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableMap immutableMap, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, double d, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        super.A09 = str18;
        super.A03 = null;
        super.A02 = uri3;
        super.A01 = uri2;
        super.A05 = str14;
        super.A06 = str15;
        super.A04 = hcr;
        super.A08 = str17;
        super.A07 = str16;
        this.A0C = uri4;
        this.A09 = uri;
        this.A0o = z5;
        this.A0p = z6;
        this.A0G = h9c;
        this.A0X = str6;
        this.A0T = null;
        this.A0U = null;
        this.A0W = str5;
        this.A0d = str10;
        this.A0a = str8;
        this.A0g = str12;
        this.A0D = null;
        this.A0L = immutableList2;
        this.A0M = null;
        this.A0f = str11;
        this.A0e = null;
        this.A0F = interactiveEffectMetadata;
        this.A0h = str13;
        this.A0c = str9;
        this.A07 = j2;
        this.A08 = j3;
        this.A0E = compressionMethod;
        this.A0N = immutableList3;
        this.A0K = immutableList;
        this.A0H = null;
        this.A0Y = str7;
        this.A0R = str3;
        this.A0l = z3;
        this.A0O = immutableMap;
        this.A00 = null;
        this.A0u = false;
        this.A0v = false;
        this.A10 = z10;
        this.A0w = false;
        this.A14 = false;
        this.A11 = false;
        this.A12 = z11;
        this.A13 = false;
        this.A0z = false;
        this.A0y = false;
        this.A0x = z9;
        this.A0S = str4;
        this.A0m = z4;
        this.A01 = d;
        this.A02 = 0;
        this.A0b = null;
        this.A0I = null;
        this.A15 = A00();
        this.A0J = null;
        this.A0i = z;
        this.A0s = z7;
        this.A0r = false;
        this.A0q = false;
        this.A0k = false;
        this.A0j = z2;
        this.A0t = z8;
        this.A0Z = null;
        this.A0V = null;
        this.A06 = 0L;
        super.A00 = null;
        this.A0n = false;
        this.A0P = str;
        this.A0A = null;
        this.A0Q = str2;
        this.A05 = j;
        this.A04 = 0;
        this.A03 = 0;
        this.A0B = null;
    }

    public EffectItem(Parcel parcel) {
        super(parcel);
        HashMap A1E;
        this.A0C = (Uri) 4YV.A0l(parcel, Uri.class);
        this.A09 = (Uri) 4YV.A0l(parcel, Uri.class);
        this.A0o = C53v.A0S(parcel);
        this.A0p = C53v.A0S(parcel);
        this.A0G = C53v.A07(parcel, H9C.class);
        this.A0X = parcel.readString();
        this.A0T = parcel.readString();
        this.A0U = parcel.readString();
        this.A0W = parcel.readString();
        this.A0d = parcel.readString();
        this.A0a = parcel.readString();
        this.A0g = parcel.readString();
        this.A0D = null;
        this.A0L = C53v.A02(parcel, AREffectAsyncAsset.CREATOR);
        this.A0M = C53v.A02(parcel, EffectAsset.CREATOR);
        this.A0f = parcel.readString();
        this.A0e = parcel.readString();
        this.A0F = (InteractiveEffectMetadata) 1BL.A0C(parcel, InteractiveEffectMetadata.class);
        this.A0h = parcel.readString();
        this.A0c = parcel.readString();
        this.A07 = parcel.readLong();
        this.A08 = parcel.readLong();
        this.A0E = ARRequestAsset.CompressionMethod.values()[parcel.readInt()];
        this.A0N = C53v.A03(parcel, GraphQLInspirationsCaptureMode.class);
        this.A0K = C53v.A04(parcel, ARCapabilityMinVersionModeling.class);
        this.A0H = (EffectMetaData) 1BL.A0C(parcel, EffectMetaData.class);
        this.A0Y = parcel.readString();
        this.A0R = parcel.readString();
        this.A0l = C53v.A0S(parcel);
        int readInt = parcel.readInt();
        if (readInt != -1) {
            A1E = GOn.A1E(readInt);
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= readInt) {
                    break;
                }
                A1E.put(parcel.readString(), FJ8.A01(parcel));
                i = i2 + 1;
            }
        } else {
            A1E = null;
        }
        this.A0O = ImmutableMap.copyOf((Map) A1E);
        this.A00 = null;
        this.A0u = C53v.A0S(parcel);
        this.A0v = C53v.A0S(parcel);
        this.A10 = C53v.A0S(parcel);
        this.A0w = C53v.A0S(parcel);
        this.A14 = C53v.A0S(parcel);
        this.A11 = C53v.A0S(parcel);
        this.A12 = C53v.A0S(parcel);
        this.A13 = C53v.A0S(parcel);
        this.A0z = C53v.A0S(parcel);
        this.A0y = C53v.A0S(parcel);
        this.A0x = C53v.A0S(parcel);
        this.A0S = parcel.readString();
        this.A0m = C53v.A0S(parcel);
        this.A01 = parcel.readDouble();
        this.A02 = parcel.readInt();
        this.A0b = parcel.readString();
        this.A15 = A00();
        this.A0I = (MontageAttributionData) 1BL.A0C(parcel, MontageAttributionData.class);
        this.A0J = (EffectVideoPreviewData) 1BL.A0C(parcel, EffectVideoPreviewData.class);
        this.A0i = C53v.A0S(parcel);
        this.A0s = C53v.A0S(parcel);
        this.A0r = C53v.A0S(parcel);
        this.A0q = C53v.A0S(parcel);
        this.A0k = C53v.A0S(parcel);
        this.A0j = C53v.A0S(parcel);
        this.A0t = C53v.A0S(parcel);
        this.A0Z = parcel.readString();
        this.A0V = parcel.readString();
        this.A06 = parcel.readLong();
        this.A0n = C53v.A0S(parcel);
        this.A0P = parcel.readString();
        this.A0A = (Uri) 4YV.A0l(parcel, Uri.class);
        this.A0Q = parcel.readString();
        this.A05 = parcel.readLong();
        this.A04 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A0B = (Uri) 4YV.A0l(parcel, Uri.class);
    }

    private ImmutableList A00() {
        if (this.A0G != H9C.A01) {
            return null;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        String str = this.A0g;
        if (str != null) {
            boolean A03 = 2yD.A03(1BK.A0K(), 36322259249415428L);
            String str2 = this.A0X;
            String str3 = super.A09;
            if (str3 == null) {
                str3 = str2;
            }
            String concat = str3.concat(".msqrd");
            String str4 = this.A0W;
            String str5 = this.A0f;
            String str6 = this.A0h;
            long j = this.A07;
            long j2 = this.A08;
            ARRequestAsset.CompressionMethod compressionMethod = this.A0E;
            ImmutableList immutableList = this.A0K;
            builder.m11011add((Object) ARRequestAsset.A00(compressionMethod, null, str2, concat, str, str3, str4, str5, str6, this.A0S, A03 ? this.A0c : null, immutableList, this.A0L, j, j2, false, false, false, this.A10));
        }
        return builder.build();
    }

    public ImmutableList A04(boolean z) {
        boolean A06 = A06();
        if (!A06 && !z) {
            return this.A15;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        ImmutableList immutableList = this.A15;
        if (immutableList != null) {
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                ARRequestAsset aRRequestAsset = (ARRequestAsset) it.next();
                String str = A06 ? "1004" : "";
                FH3 fh3 = aRRequestAsset.A02;
                String str2 = fh3.A0B;
                String str3 = aRRequestAsset.A07;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = aRRequestAsset.A09;
                boolean z2 = aRRequestAsset.A0B;
                EffectAssetType effectAssetType = EffectAssetType.PINNED_EFFECT;
                ARAssetType aRAssetType = fh3.A02;
                ARAssetType aRAssetType2 = ARAssetType.EFFECT;
                02W.A07(AnonymousClass001.A1W(aRAssetType, aRAssetType2), "Cannot get effect asset type from asset type other than effect");
                boolean A1W = AnonymousClass001.A1W(effectAssetType, fh3.A04);
                String str5 = aRRequestAsset.A06;
                02W.A07(AnonymousClass001.A1W(aRAssetType, aRAssetType2), "Cannot get required SDK version from support asset");
                String str6 = fh3.A0C;
                long j = aRRequestAsset.A00;
                long j2 = aRRequestAsset.A01;
                String str7 = str3;
                String str8 = str;
                builder.m11011add((Object) ARRequestAsset.A00(fh3.A03, aRRequestAsset.A03, str2, str7, str4, str8, "", str5, str6, fh3.A08, aRRequestAsset.A08, aRRequestAsset.A0A, aRRequestAsset.A04, j, j2, z2, A1W, fh3.A06.booleanValue(), aRRequestAsset.A0C));
            }
        }
        return builder.build();
    }

    public String A05() {
        InteractiveEffectMetadata interactiveEffectMetadata = this.A0F;
        String str = interactiveEffectMetadata != null ? interactiveEffectMetadata.A00 : this.A0V;
        if (1JF.A0B(str)) {
            str = this.A0X;
            if (1JF.A0B(str)) {
                str = "";
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0 == X.HCR.A04) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A06() {
        /*
            r301 = this;
            r0 = r301
            X.HCR r0 = r0.A04
            r302 = r0
            X.HCR r0 = X.HCR.A02
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L1c
            X.HCR r0 = X.HCR.A04
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L1f
        L1c:
            r0 = 1
            r305 = r0
        L1f:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.model.art.EffectItem.A06():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r301.A0q != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A07() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A0s
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1d
            r0 = r301
            boolean r0 = r0.A0r
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L1d
            r0 = r301
            boolean r0 = r0.A0q
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L1f
        L1d:
            r0 = 0
            r302 = r0
        L1f:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.model.art.EffectItem.A07():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.A0q == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A08() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A0r
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L14
            r0 = r301
            boolean r0 = r0.A0q
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            if (r0 != 0) goto L16
        L14:
            r0 = 0
            r302 = r0
        L16:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.model.art.EffectItem.A08():boolean");
    }

    public boolean A09() {
        return AnonymousClass001.A1W(super.A04, HCR.A02);
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof EffectItem)) {
            if (obj == this) {
                return true;
            }
            EffectItem effectItem = (EffectItem) obj;
            if (Objects.equal(super.A09, ((BaseItem) effectItem).A09) && Objects.equal(this.A0W, effectItem.A0W) && Objects.equal(this.A0d, effectItem.A0d) && Objects.equal(super.A03, ((BaseItem) effectItem).A03) && Objects.equal(super.A02, ((BaseItem) effectItem).A02) && Objects.equal(super.A01, ((BaseItem) effectItem).A01) && Objects.equal(this.A0C, effectItem.A0C) && Objects.equal(this.A09, effectItem.A09) && Objects.equal(this.A0X, effectItem.A0X) && Objects.equal(this.A0T, effectItem.A0T) && Objects.equal(this.A0U, effectItem.A0U) && Objects.equal(this.A0a, effectItem.A0a) && Objects.equal(this.A0g, effectItem.A0g) && Objects.equal(this.A0M, effectItem.A0M) && Objects.equal(this.A0F, effectItem.A0F) && Objects.equal(super.A04, ((BaseItem) effectItem).A04) && Objects.equal(super.A08, ((BaseItem) effectItem).A08) && Objects.equal(super.A07, ((BaseItem) effectItem).A07) && Objects.equal(this.A0f, effectItem.A0f) && Objects.equal(this.A0e, effectItem.A0e) && Objects.equal(this.A0h, effectItem.A0h) && Objects.equal(this.A0c, effectItem.A0c) && Objects.equal(Long.valueOf(this.A07), Long.valueOf(effectItem.A07)) && Objects.equal(Long.valueOf(this.A08), Long.valueOf(effectItem.A08)) && Objects.equal(this.A0E, effectItem.A0E) && Objects.equal(this.A0N, effectItem.A0N) && Objects.equal(this.A0K, effectItem.A0K) && Objects.equal(this.A0H, effectItem.A0H) && Objects.equal(this.A0Y, effectItem.A0Y) && Objects.equal(this.A0R, effectItem.A0R) && 4YU.A1a(Boolean.valueOf(this.A0l), effectItem.A0l) && Objects.equal(this.A0O, effectItem.A0O) && Objects.equal(this.A00, effectItem.A00) && 4YU.A1a(Boolean.valueOf(this.A0u), effectItem.A0u) && 4YU.A1a(Boolean.valueOf(this.A14), effectItem.A14) && 4YU.A1a(Boolean.valueOf(this.A11), effectItem.A11) && 4YU.A1a(Boolean.valueOf(this.A12), effectItem.A12) && 4YU.A1a(Boolean.valueOf(this.A13), effectItem.A13) && 4YU.A1a(Boolean.valueOf(this.A0z), effectItem.A0z) && 4YU.A1a(Boolean.valueOf(this.A0y), effectItem.A0y) && 4YU.A1a(Boolean.valueOf(this.A0x), effectItem.A0x) && 4YU.A1a(Boolean.valueOf(this.A0v), effectItem.A0v) && 4YU.A1a(Boolean.valueOf(this.A10), effectItem.A10) && 4YU.A1a(Boolean.valueOf(this.A0w), effectItem.A0w) && Objects.equal(this.A0S, effectItem.A0S) && 4YU.A1a(Boolean.valueOf(this.A0m), effectItem.A0m) && Objects.equal(Double.valueOf(this.A01), Double.valueOf(effectItem.A01))) {
                if (DKG.A1Z(effectItem.A02, Integer.valueOf(this.A02)) && Objects.equal(this.A0b, effectItem.A0b) && Objects.equal(this.A0I, effectItem.A0I) && Objects.equal(this.A0J, effectItem.A0J) && 4YU.A1a(Boolean.valueOf(this.A0i), effectItem.A0i) && 4YU.A1a(Boolean.valueOf(this.A0s), effectItem.A0s) && 4YU.A1a(Boolean.valueOf(this.A0r), effectItem.A0r) && 4YU.A1a(Boolean.valueOf(this.A0q), effectItem.A0q) && 4YU.A1a(Boolean.valueOf(this.A0k), effectItem.A0k) && 4YU.A1a(Boolean.valueOf(this.A0j), effectItem.A0j) && 4YU.A1a(Boolean.valueOf(this.A0t), effectItem.A0t) && Objects.equal(this.A0Z, effectItem.A0Z) && Objects.equal(this.A0V, effectItem.A0V) && Objects.equal(Long.valueOf(this.A06), Long.valueOf(effectItem.A06)) && 4YU.A1a(Boolean.valueOf(this.A0n), effectItem.A0n) && Objects.equal(this.A0P, effectItem.A0P) && Objects.equal(this.A0Q, effectItem.A0Q) && Objects.equal(Long.valueOf(this.A05), Long.valueOf(effectItem.A05)) && Objects.equal(this.A0A, effectItem.A0A)) {
                    if (DKG.A1Z(effectItem.A04, Integer.valueOf(this.A04))) {
                        if (DKG.A1Z(effectItem.A03, Integer.valueOf(this.A03))) {
                            z = 4YV.A1Z(this.A0B, effectItem.A0B);
                        }
                    }
                }
            }
        }
        return z;
    }

    public int hashCode() {
        Object[] objArr = new Object[68];
        System.arraycopy(new Object[]{super.A09, this.A0W, this.A0d, super.A03, this.A0X, this.A0T, this.A0U, this.A0g, super.A02, super.A01, this.A0C, this.A09, this.A0M, this.A0F, super.A08, super.A07, this.A0f, this.A0e, this.A0h, this.A0c, Long.valueOf(this.A07), Long.valueOf(this.A08), this.A0E, this.A0N, this.A0K, this.A0H, this.A0Y}, 0, objArr, 0, 27);
        String str = this.A0R;
        Boolean valueOf = Boolean.valueOf(this.A0l);
        ImmutableMap immutableMap = this.A0O;
        ImmutableMap immutableMap2 = this.A00;
        Boolean valueOf2 = Boolean.valueOf(this.A0u);
        Boolean valueOf3 = Boolean.valueOf(this.A0v);
        Boolean valueOf4 = Boolean.valueOf(this.A10);
        Boolean valueOf5 = Boolean.valueOf(this.A0w);
        Boolean valueOf6 = Boolean.valueOf(this.A14);
        Boolean valueOf7 = Boolean.valueOf(this.A11);
        Boolean valueOf8 = Boolean.valueOf(this.A12);
        Boolean valueOf9 = Boolean.valueOf(this.A13);
        Boolean valueOf10 = Boolean.valueOf(this.A0z);
        Boolean valueOf11 = Boolean.valueOf(this.A0y);
        Boolean valueOf12 = Boolean.valueOf(this.A0x);
        String str2 = this.A0S;
        Double valueOf13 = Double.valueOf(this.A01);
        System.arraycopy(new Object[]{str, valueOf, immutableMap, immutableMap2, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, str2, valueOf13, valueOf13, Integer.valueOf(this.A02), this.A0b, this.A0I, this.A0J, Boolean.valueOf(this.A0i), Boolean.valueOf(this.A0s), Boolean.valueOf(this.A0r), Boolean.valueOf(this.A0q), Boolean.valueOf(this.A0k)}, 0, objArr, 27, 27);
        Boolean valueOf14 = Boolean.valueOf(this.A0j);
        Boolean valueOf15 = Boolean.valueOf(this.A0t);
        String str3 = this.A0Z;
        String str4 = this.A0V;
        Long valueOf16 = Long.valueOf(this.A06);
        Boolean valueOf17 = Boolean.valueOf(this.A0n);
        String str5 = this.A0P;
        Uri uri = this.A0A;
        System.arraycopy(new Object[]{valueOf14, valueOf15, str3, str4, valueOf16, valueOf17, str5, uri, this.A0Q, Long.valueOf(this.A05), uri, Integer.valueOf(this.A04), Integer.valueOf(this.A03), this.A0B}, 0, objArr, 54, 14);
        return Arrays.hashCode(objArr);
    }

    @Override // com.facebook.messaging.montage.model.art.BaseItem, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(this.A0C);
        parcel.writeValue(this.A09);
        parcel.writeInt(this.A0o ? 1 : 0);
        parcel.writeInt(this.A0p ? 1 : 0);
        C53v.A0J(parcel, this.A0G);
        parcel.writeString(this.A0X);
        parcel.writeString(this.A0T);
        parcel.writeString(this.A0U);
        parcel.writeString(this.A0W);
        parcel.writeString(this.A0d);
        parcel.writeString(this.A0a);
        parcel.writeString(this.A0g);
        C53v.A0D(parcel, this.A0L);
        C53v.A0D(parcel, this.A0M);
        parcel.writeString(this.A0f);
        parcel.writeString(this.A0e);
        parcel.writeParcelable(this.A0F, 0);
        parcel.writeString(this.A0h);
        parcel.writeString(this.A0c);
        parcel.writeLong(this.A07);
        parcel.writeLong(this.A08);
        parcel.writeInt(this.A0E.ordinal());
        ImmutableList immutableList = this.A0N;
        if (immutableList == null) {
            immutableList = ImmutableList.of();
        }
        C53v.A0C(parcel, immutableList);
        parcel.writeList(this.A0K);
        parcel.writeParcelable(this.A0H, i);
        parcel.writeString(this.A0Y);
        parcel.writeString(this.A0R);
        parcel.writeInt(this.A0l ? 1 : 0);
        ImmutableMap immutableMap = this.A0O;
        parcel.writeInt(immutableMap == null ? -1 : immutableMap.size());
        if (immutableMap != null) {
            Iterator A14 = AbM.A14(immutableMap);
            while (A14.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A14);
                parcel.writeString(AnonymousClass001.A0j(A0z));
                FJ8.A0A(parcel, (C23u) A0z.getValue());
            }
        }
        parcel.writeInt(this.A0u ? 1 : 0);
        parcel.writeInt(this.A0v ? 1 : 0);
        parcel.writeInt(this.A10 ? 1 : 0);
        parcel.writeInt(this.A0w ? 1 : 0);
        parcel.writeInt(this.A14 ? 1 : 0);
        parcel.writeInt(this.A11 ? 1 : 0);
        parcel.writeInt(this.A12 ? 1 : 0);
        parcel.writeInt(this.A13 ? 1 : 0);
        parcel.writeInt(this.A0z ? 1 : 0);
        parcel.writeInt(this.A0y ? 1 : 0);
        parcel.writeInt(this.A0x ? 1 : 0);
        parcel.writeString(this.A0S);
        parcel.writeInt(this.A0m ? 1 : 0);
        parcel.writeDouble(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A0b);
        parcel.writeParcelable(this.A0I, 0);
        parcel.writeParcelable(this.A0J, 0);
        parcel.writeInt(this.A0i ? 1 : 0);
        parcel.writeInt(this.A0s ? 1 : 0);
        parcel.writeInt(this.A0r ? 1 : 0);
        parcel.writeInt(this.A0q ? 1 : 0);
        parcel.writeInt(this.A0k ? 1 : 0);
        parcel.writeInt(this.A0j ? 1 : 0);
        parcel.writeInt(this.A0t ? 1 : 0);
        parcel.writeString(this.A0Z);
        parcel.writeString(this.A0V);
        parcel.writeLong(this.A06);
        parcel.writeInt(this.A0n ? 1 : 0);
        parcel.writeString(this.A0P);
        parcel.writeValue(this.A0A);
        parcel.writeString(this.A0Q);
        parcel.writeLong(this.A05);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
        parcel.writeValue(this.A0B);
    }
}
