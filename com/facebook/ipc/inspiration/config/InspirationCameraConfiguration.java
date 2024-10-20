package com.facebook.ipc.inspiration.config;

import X.0Q8;
import X.1BM;
import X.28Q;
import X.5BB;
import X.7zO;
import X.AbF;
import X.AbG;
import X.AbJ;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.CSR;
import X.DKG;
import X.GOm;
import X.H9F;
import X.N1P;
import X.NAm;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationCameraConfiguration.class */
public final class InspirationCameraConfiguration implements Parcelable, NAm {
    public static volatile Long A0E;
    public static final Parcelable.Creator CREATOR = new CSR(28);
    public final int A00;
    public final int A01;
    public final H9F A02;
    public final Long A03;
    public final Set A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    /* loaded from: InspirationCameraConfiguration$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            N1P n1p = new N1P();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -2139216184:
                                if (A1C.equals("should_override_camera_preview_res_to_output_video_size")) {
                                    n1p.A0B = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -2042910381:
                                if (A1C.equals("high_res_video_capture_device_min_year_class")) {
                                    n1p.A00 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case -1686413284:
                                if (A1C.equals("is_video_capture_supported")) {
                                    n1p.A09 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -401406212:
                                if (A1C.equals("max_music_duration_ms")) {
                                    n1p.A01 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case -389938761:
                                if (A1C.equals("is_one_camera_sdk_allowed")) {
                                    n1p.A07 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -346546862:
                                if (A1C.equals("should_override_video_res_to_preview_size")) {
                                    n1p.A0C = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -202216181:
                                if (A1C.equals("is_gif_enabled_in_camera_roll")) {
                                    n1p.A05 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 204949625:
                                if (A1C.equals(GOm.A00(63))) {
                                    n1p.A02 = (H9F) AbstractC11224vw.A02(abstractC01033pi, c27t, H9F.class);
                                    break;
                                }
                                break;
                            case 471183091:
                                if (A1C.equals("is_video_length_tool_tapped")) {
                                    n1p.A0A = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 981554813:
                                if (A1C.equals("is_high_res_video_capture_enabled")) {
                                    n1p.A06 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1209192702:
                                if (A1C.equals("should_save_camera_facing")) {
                                    n1p.A0D = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1342020960:
                                if (A1C.equals("max_video_upload_length_ms")) {
                                    n1p.A00(abstractC01033pi.A1B());
                                    break;
                                }
                                break;
                            case 1960454675:
                                if (A1C.equals("is_photo_capture_supported")) {
                                    n1p.A08 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationCameraConfiguration.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationCameraConfiguration(n1p);
        }
    }

    /* loaded from: InspirationCameraConfiguration$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationCameraConfiguration inspirationCameraConfiguration = (InspirationCameraConfiguration) obj;
            r302.A0b();
            int i = inspirationCameraConfiguration.A00;
            r302.A0o("high_res_video_capture_device_min_year_class");
            r302.A0f(i);
            AbstractC11224vw.A05(r302, c26c, inspirationCameraConfiguration.A02, GOm.A00(63));
            boolean z = inspirationCameraConfiguration.A05;
            r302.A0o("is_gif_enabled_in_camera_roll");
            r302.A0v(z);
            boolean z2 = inspirationCameraConfiguration.A06;
            r302.A0o("is_high_res_video_capture_enabled");
            r302.A0v(z2);
            boolean z3 = inspirationCameraConfiguration.A07;
            r302.A0o("is_one_camera_sdk_allowed");
            r302.A0v(z3);
            boolean z4 = inspirationCameraConfiguration.A08;
            r302.A0o("is_photo_capture_supported");
            r302.A0v(z4);
            boolean z5 = inspirationCameraConfiguration.A09;
            r302.A0o("is_video_capture_supported");
            r302.A0v(z5);
            boolean z6 = inspirationCameraConfiguration.A0A;
            r302.A0o("is_video_length_tool_tapped");
            r302.A0v(z6);
            int i2 = inspirationCameraConfiguration.A01;
            r302.A0o("max_music_duration_ms");
            r302.A0f(i2);
            long Avk = inspirationCameraConfiguration.Avk();
            r302.A0o("max_video_upload_length_ms");
            r302.A0g(Avk);
            boolean z7 = inspirationCameraConfiguration.A0B;
            r302.A0o("should_override_camera_preview_res_to_output_video_size");
            r302.A0v(z7);
            boolean z8 = inspirationCameraConfiguration.A0C;
            r302.A0o("should_override_video_res_to_preview_size");
            r302.A0v(z8);
            DKG.A1T(r302, "should_save_camera_facing", inspirationCameraConfiguration.A0D);
        }
    }

    public InspirationCameraConfiguration(N1P n1p) {
        this.A00 = n1p.A00;
        this.A02 = n1p.A02;
        this.A05 = n1p.A05;
        this.A06 = n1p.A06;
        this.A07 = n1p.A07;
        this.A08 = n1p.A08;
        this.A09 = n1p.A09;
        this.A0A = n1p.A0A;
        this.A01 = n1p.A01;
        this.A03 = n1p.A03;
        this.A0B = n1p.A0B;
        this.A0C = n1p.A0C;
        this.A0D = n1p.A0D;
        this.A04 = Collections.unmodifiableSet(n1p.A04);
    }

    public InspirationCameraConfiguration(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        Long l = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = H9F.values()[parcel.readInt()];
        }
        int i = 0;
        this.A05 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A06 = 1BM.A07(parcel);
        this.A07 = 1BM.A07(parcel);
        this.A08 = 1BM.A07(parcel);
        this.A09 = 1BM.A07(parcel);
        this.A0A = 1BM.A07(parcel);
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt() != 0 ? 7zO.A0j(parcel) : l;
        this.A0B = 1BM.A07(parcel);
        this.A0C = 1BM.A07(parcel);
        this.A0D = AbJ.A1V(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A04 = Collections.unmodifiableSet(A0v);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.N1P, boolean, com.facebook.ipc.inspiration.config.InspirationCameraConfiguration] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.N1P, boolean, com.facebook.ipc.inspiration.config.InspirationCameraConfiguration] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.N1P, boolean, com.facebook.ipc.inspiration.config.InspirationCameraConfiguration] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.N1P, long, com.facebook.ipc.inspiration.config.InspirationCameraConfiguration] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.N1P, boolean, com.facebook.ipc.inspiration.config.InspirationCameraConfiguration] */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.N1P, boolean, com.facebook.ipc.inspiration.config.InspirationCameraConfiguration] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.N1P, boolean] */
    public static N1P A00(NAm nAm) {
        if (nAm == null) {
            return new N1P();
        }
        new Object();
        HashSet A0v = AnonymousClass001.A0v();
        ((N1P) A0v).A04 = A0v;
        if (!(nAm instanceof InspirationCameraConfiguration)) {
            InspirationCameraConfiguration inspirationCameraConfiguration = (InspirationCameraConfiguration) nAm;
            A01(inspirationCameraConfiguration, inspirationCameraConfiguration);
            ?? Avk = nAm.Avk();
            Avk.A00((long) Avk);
            ?? r0 = Avk.A0B;
            ((N1P) r0).A0B = r0;
            ?? r02 = r0.A0C;
            ((N1P) r02).A0C = r02;
            ?? r03 = r02.A0D;
            ((N1P) r03).A0D = r03;
            return r03;
        }
        InspirationCameraConfiguration inspirationCameraConfiguration2 = (InspirationCameraConfiguration) nAm;
        A01(inspirationCameraConfiguration2, inspirationCameraConfiguration2);
        N1P n1p = inspirationCameraConfiguration2.A03;
        n1p.A03 = n1p;
        ?? r04 = n1p.A0B;
        ((N1P) r04).A0B = r04;
        ?? r05 = r04.A0C;
        ((N1P) r05).A0C = r05;
        ?? r06 = r05.A0D;
        ((N1P) r06).A0D = r06;
        HashSet A1E = AbF.A1E(r06.A04);
        ((N1P) A1E).A04 = A1E;
        return A1E;
    }

    public static void A01(N1P n1p, InspirationCameraConfiguration inspirationCameraConfiguration) {
        n1p.A00 = inspirationCameraConfiguration.A00;
        n1p.A02 = inspirationCameraConfiguration.A02;
        n1p.A05 = inspirationCameraConfiguration.A05;
        n1p.A06 = inspirationCameraConfiguration.A06;
        n1p.A07 = inspirationCameraConfiguration.A07;
        n1p.A08 = inspirationCameraConfiguration.A08;
        n1p.A09 = inspirationCameraConfiguration.A09;
        n1p.A0A = inspirationCameraConfiguration.A0A;
        n1p.A01 = inspirationCameraConfiguration.A01;
    }

    @Override // X.NAm
    public long Avk() {
        Long l;
        if (this.A04.contains("maxVideoUploadLengthMs")) {
            l = this.A03;
        } else {
            if (A0E == null) {
                synchronized (this) {
                    if (A0E == null) {
                        A0E = 60000L;
                    }
                }
            }
            l = A0E;
        }
        return l.longValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationCameraConfiguration)) {
                return false;
            }
            InspirationCameraConfiguration inspirationCameraConfiguration = (InspirationCameraConfiguration) obj;
            if (this.A00 != inspirationCameraConfiguration.A00 || this.A02 != inspirationCameraConfiguration.A02 || this.A05 != inspirationCameraConfiguration.A05 || this.A06 != inspirationCameraConfiguration.A06 || this.A07 != inspirationCameraConfiguration.A07 || this.A08 != inspirationCameraConfiguration.A08 || this.A09 != inspirationCameraConfiguration.A09 || this.A0A != inspirationCameraConfiguration.A0A || this.A01 != inspirationCameraConfiguration.A01 || Avk() != inspirationCameraConfiguration.Avk() || this.A0B != inspirationCameraConfiguration.A0B || this.A0C != inspirationCameraConfiguration.A0C || this.A0D != inspirationCameraConfiguration.A0D) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.A00 + 31;
        return C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A01((C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02(C1pq.A02((i * 31) + C3o5.A03(this.A02), this.A05), this.A06), this.A07), this.A08), this.A09), this.A0A) * 31) + this.A01, Avk()), this.A0B), this.A0C), this.A0D);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("InspirationCameraConfiguration{highResVideoCaptureDeviceMinYearClass=");
        A0k.append(this.A00);
        A0k.append(", initialCameraFacing=");
        A0k.append(this.A02);
        A0k.append(", isGifEnabledInCameraRoll=");
        A0k.append(this.A05);
        A0k.append(", isHighResVideoCaptureEnabled=");
        A0k.append(this.A06);
        A0k.append(", isOneCameraSdkAllowed=");
        A0k.append(this.A07);
        A0k.append(", isPhotoCaptureSupported=");
        A0k.append(this.A08);
        A0k.append(", isVideoCaptureSupported=");
        A0k.append(this.A09);
        A0k.append(", isVideoLengthToolTapped=");
        A0k.append(this.A0A);
        A0k.append(", maxMusicDurationMs=");
        A0k.append(this.A01);
        A0k.append(", maxVideoUploadLengthMs=");
        A0k.append(Avk());
        A0k.append(", shouldOverrideCameraPreviewResToOutputVideoSize=");
        A0k.append(this.A0B);
        A0k.append(", shouldOverrideVideoResToPreviewSize=");
        A0k.append(this.A0C);
        A0k.append(", shouldSaveCameraFacing=");
        return AbstractC2327GOs.A0X(A0k, this.A0D);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        C3o5.A0e(parcel, this.A02);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A01);
        C3o5.A0g(parcel, this.A03);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        Iterator A0S = C3o5.A0S(parcel, this.A04);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
