package X;

import com.google.common.collect.ImmutableMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.5ep, reason: invalid class name */
/* loaded from: 5ep.class */
public final class C5ep {
    public static final ImmutableMap A00;
    public static final /* synthetic */ C5ep[] A01;
    public static final C5ep A02;
    public static final C5ep A03;
    public static final C5ep A04;
    public static final C5ep A05;
    public static final C5ep A06;
    public static final C5ep A07;
    public static final C5ep A08;
    public static final C5ep A09;
    public static final C5ep A0A;
    public static final C5ep A0B;
    public static final C5ep A0C;
    public static final C5ep A0D;
    public static final C5ep A0E;
    public static final C5ep A0F;
    public static final C5ep A0G;
    public static final C5ep A0H;
    public static final C5ep A0I;
    public static final C5ep A0J;
    public static final C5ep A0K;
    public static final C5ep A0L;
    public static final C5ep A0M;
    public static final C5ep A0N;
    public static final C5ep A0O;
    public static final C5ep A0P;
    public static final C5ep A0Q;
    public static final C5ep A0R;
    public static final C5ep A0S;
    public static final C5ep A0T;
    public static final C5ep A0U;
    public static final C5ep A0V;
    public final String DBSerialValue;

    static {
        C5ep c5ep = new C5ep("UNSPECIFIED", 0, "unspecified");
        A0R = c5ep;
        C5ep c5ep2 = new C5ep("KEYBOARD", 1, "keyboard");
        A0B = c5ep2;
        C5ep c5ep3 = new C5ep("MONTAGE", 2, "montage");
        A0F = c5ep3;
        C5ep c5ep4 = new C5ep("MONTAGE_BACK", 3, "montageback");
        A0G = c5ep4;
        C5ep c5ep5 = new C5ep("MONTAGE_FRONT", 4, "montagefront");
        A0K = c5ep5;
        C5ep c5ep6 = new C5ep("MONTAGE_CAMERA", 5, "montagecamera");
        A0H = c5ep6;
        C5ep c5ep7 = new C5ep("MONTAGE_CAMERA_BACK", 6, "montagecameraback");
        A0I = c5ep7;
        C5ep c5ep8 = new C5ep("MONTAGE_CAMERA_FRONT", 7, "montagecamerafront");
        A0J = c5ep8;
        C5ep c5ep9 = new C5ep("CONTENT_SEARCH", 8, "content_search");
        A08 = c5ep9;
        C5ep c5ep10 = new C5ep("MEDIA_PICKER", 9, "mediapicker");
        A0C = c5ep10;
        C5ep c5ep11 = new C5ep("CAMERA", 10, "camera");
        A04 = c5ep11;
        C5ep c5ep12 = new C5ep("AUDIO", 11, "audio");
        A03 = c5ep12;
        C5ep c5ep13 = new C5ep("VOICE_CLIP", 12, "voiceclip");
        A0V = c5ep13;
        C5ep c5ep14 = new C5ep("COMPOSER_LONGPRESS", 13, "composer_longpress");
        A07 = c5ep14;
        C5ep c5ep15 = new C5ep("VIDEO_STICKER", 14, "videosticker");
        A0U = c5ep15;
        C5ep c5ep16 = new C5ep("VIDEO", 15, "video");
        A0S = c5ep16;
        C5ep c5ep17 = new C5ep("TRIMMED_VIDEO", 16, "trimmedvideo");
        A0Q = c5ep17;
        C5ep c5ep18 = new C5ep("SHARE", 17, "share");
        A0O = c5ep18;
        C5ep c5ep19 = new C5ep("SHARED_MEDIA", 18, "shared_media");
        A0P = c5ep19;
        C5ep c5ep20 = new C5ep("ATTACHED_MEDIA", 19, "attached_media");
        A02 = c5ep20;
        C5ep c5ep21 = new C5ep("FORWARD", 20, "forward");
        A09 = c5ep21;
        C5ep c5ep22 = new C5ep("GALLERY", 21, "gallery");
        A0A = c5ep22;
        C5ep c5ep23 = new C5ep("QUICKCAM_FRONT", 22, "quickcamfront");
        A0N = c5ep23;
        C5ep c5ep24 = new C5ep("QUICKCAM_BACK", 23, "quickcamback");
        A0M = c5ep24;
        C5ep c5ep25 = new C5ep("CAMERACORE_FRONT", 24, "cameracorefront");
        A06 = c5ep25;
        C5ep c5ep26 = new C5ep("CAMERACORE_BACK", 25, "cameracoreback");
        A05 = c5ep26;
        C5ep c5ep27 = new C5ep("MEDIA_PICKER_GALLERY", 26, "mediapicker_gallery");
        A0D = c5ep27;
        C5ep c5ep28 = new C5ep("MEDIA_VIEWER_EDITOR", 27, "media_viewer_editor");
        A0E = c5ep28;
        C5ep c5ep29 = new C5ep("PAGE_SAVED_REPLY", 28, "page_saved_reply");
        A0L = c5ep29;
        C5ep c5ep30 = new C5ep("VIDEO_MMS", 29, "video_mms");
        A0T = c5ep30;
        C5ep[] c5epArr = new C5ep[30];
        System.arraycopy(new C5ep[]{c5ep, c5ep2, c5ep3, c5ep4, c5ep5, c5ep6, c5ep7, c5ep8, c5ep9, c5ep10, c5ep11, c5ep12, c5ep13, c5ep14, c5ep15, c5ep16, c5ep17, c5ep18, c5ep19, c5ep20, c5ep21, c5ep22, c5ep23, c5ep24, c5ep25, c5ep26, c5ep27}, 0, c5epArr, 0, 27);
        System.arraycopy(new C5ep[]{c5ep28, c5ep29, c5ep30}, 0, c5epArr, 27, 3);
        A01 = c5epArr;
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        for (C5ep c5ep31 : values()) {
            builder.put(c5ep31.DBSerialValue, c5ep31);
        }
        A00 = builder.build();
    }

    public C5ep(String str, int i, String str2) {
        this.DBSerialValue = str2;
    }

    public static C5ep valueOf(String str) {
        return (C5ep) Enum.valueOf(C5ep.class, str);
    }

    public static C5ep[] values() {
        return (C5ep[]) A01.clone();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r301 == X.C5ep.A0N) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A00() {
        /*
            r301 = this;
            X.5ep r0 = X.C5ep.A0M
            r302 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L16
            X.5ep r0 = X.C5ep.A0N
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = r303
            if (r0 != r1) goto L18
        L16:
            r0 = 1
            r304 = r0
        L18:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5ep.A00():boolean");
    }
}
