package X;

import android.graphics.Rect;
import java.util.List;

/* loaded from: Guk.class */
public final class Guk extends I82 implements Cloneable {
    public Rect A00;
    public Rect A01;
    public IBB A02;
    public IBB A03;
    public IBB A04;
    public IBB A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Double A0A;
    public Double A0B;
    public Double A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public Integer A0I;
    public Integer A0J;
    public Integer A0K;
    public Integer A0L;
    public Integer A0M;
    public Integer A0N;
    public Integer A0O;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Long A0S;
    public String A0T;
    public List A0U;
    public List A0V;
    public Boolean A0W;
    public Boolean A0X;
    public Integer A0Y;
    public final Guh A0Z;
    public final Float A0a;
    public final Float A0b;
    public final String A0c;
    public final int[] A0d = GOn.A1b();
    public Boolean A09 = false;

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:28:0x032c
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public Guk(android.hardware.Camera.Parameters r302, X.Guh r303) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Guk.<init>(android.hardware.Camera$Parameters, X.Guh):void");
    }

    public String A06() {
        String str;
        StringBuilder sb = new StringBuilder(1000);
        sb.append("mFocusMode");
        sb.append('=');
        sb.append(this.A0H);
        sb.append(",mAntibanding");
        sb.append('=');
        sb.append(this.A0D);
        sb.append(",mColorEffect");
        sb.append('=');
        sb.append(this.A0E);
        sb.append(",mIsAutoExposureLock");
        sb.append('=');
        sb.append(this.A0W);
        sb.append(",mIsAutoWhiteBalanceLock");
        sb.append('=');
        sb.append(this.A0X);
        sb.append(",mFlashMode");
        sb.append('=');
        sb.append(this.A0G);
        sb.append(",mExposureCompensation");
        sb.append('=');
        sb.append(this.A0F);
        sb.append(",mFocusAreas");
        sb.append('=');
        sb.append(I82.A04(this.A0U));
        sb.append(",mHorizontalViewAngle");
        sb.append('=');
        sb.append(this.A0a);
        sb.append(",mVerticalViewAngle");
        sb.append('=');
        sb.append(this.A0b);
        sb.append(",mJpegQuality");
        sb.append('=');
        sb.append(this.A0J);
        sb.append(",mJpegThumbnailQuality");
        sb.append('=');
        sb.append(this.A0K);
        sb.append(",mJpegThumbnailSize");
        sb.append('=');
        IBB ibb = this.A02;
        str = "null";
        if (ibb != null) {
            IBB.A01(ibb, sb);
        } else {
            sb.append(str);
        }
        sb.append(",mMeteringAreas");
        sb.append('=');
        sb.append(I82.A04(this.A0V));
        sb.append(",mPictureFormat");
        sb.append('=');
        sb.append(this.A0M);
        sb.append(",mPictureSize");
        sb.append('=');
        IBB ibb2 = this.A03;
        if (ibb2 != null) {
            IBB.A01(ibb2, sb);
        } else {
            sb.append(str);
        }
        sb.append(",mYuvPictureSize");
        sb.append('=');
        sb.append(str);
        sb.append(",mPreviewFormat");
        sb.append('=');
        sb.append(this.A0N);
        sb.append(",mPreviewFpsRange");
        sb.append('=');
        int[] iArr = this.A0d;
        sb.append(iArr[0]);
        sb.append('-');
        sb.append(iArr[1]);
        sb.append(",mPreviewSize");
        sb.append('=');
        IBB ibb3 = this.A04;
        if (ibb3 != null) {
            IBB.A01(ibb3, sb);
        } else {
            sb.append(str);
        }
        sb.append(",mIsoSensitivity");
        sb.append('=');
        sb.append(this.A0I);
        sb.append(",mSceneMode");
        sb.append('=');
        sb.append(this.A0P);
        sb.append(",mIsVideoStabilizationEnabled");
        sb.append('=');
        sb.append(this.A08);
        sb.append(",mIsPreviewStabilizationEnabled");
        sb.append('=');
        sb.append(false);
        sb.append(",mVideoSize");
        sb.append('=');
        IBB ibb4 = this.A05;
        if (ibb4 != null) {
            IBB.A01(ibb4, sb);
        } else {
            sb.append(str);
        }
        sb.append(",mWhiteBalance");
        sb.append('=');
        sb.append(this.A0Q);
        sb.append(",mZoom");
        sb.append('=');
        sb.append(this.A0R);
        sb.append(",mPreviewRect");
        sb.append("=(");
        Rect rect = this.A01;
        sb.append(rect != null ? rect.flattenToString() : str);
        sb.append(')');
        sb.append(",mPictureRect");
        sb.append("=(");
        Rect rect2 = this.A00;
        sb.append(rect2 != null ? rect2.flattenToString() : "null");
        sb.append(')');
        sb.append(",mRecordingHint");
        sb.append('=');
        sb.append(this.A09);
        sb.append(",mGpsAltitude");
        sb.append('=');
        sb.append(this.A0A);
        sb.append(",mGpsLongitude");
        sb.append('=');
        sb.append(this.A0C);
        sb.append(",mGpsLatitude");
        sb.append('=');
        sb.append(this.A0B);
        sb.append(",mGpsProcessingMethod");
        sb.append('=');
        sb.append(this.A0T);
        sb.append(",mGpsTimestamp");
        sb.append('=');
        sb.append(this.A0S);
        sb.append(",mPhotoRotation");
        sb.append('=');
        sb.append(this.A0L);
        sb.append(",mVideoRotation");
        sb.append('=');
        sb.append(this.A0Y);
        sb.append(",mIsoSensitivity");
        sb.append('=');
        sb.append(this.A0I);
        sb.append(",mSourceConfig");
        sb.append('=');
        return AnonymousClass001.A0d(this.A0c, sb);
    }

    public void A07(HX7 hx7, Object obj) {
        int i = hx7.A00;
        if (i == 0) {
            this.A0W = (Boolean) obj;
            return;
        }
        if (i == 1) {
            this.A0X = (Boolean) obj;
            return;
        }
        if (i == 2) {
            if (GOp.A1Y(I1R.A0O, this.A0Z)) {
                obj.getClass();
                boolean A1V = AnonymousClass001.A1V(obj);
                int i2 = 0;
                if (A1V) {
                    i2 = 17;
                }
                A07(I82.A0s, Integer.valueOf(i2));
                if (A1V) {
                    A07(I82.A0r, false);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            this.A08 = (Boolean) obj;
            return;
        }
        if (i == 27) {
            this.A0S = (Long) obj;
            return;
        }
        if (i == 42) {
            this.A0T = (String) obj;
            return;
        }
        if (i == 45) {
            this.A06 = (Boolean) obj;
            return;
        }
        if (i != 52) {
            if (i == 57) {
                this.A07 = (Boolean) obj;
                return;
            }
            if (i == 59) {
                this.A0Y = (Integer) obj;
                return;
            }
            switch (i) {
                case 8:
                    this.A09 = (Boolean) obj;
                    return;
                case 9:
                    this.A0H = (Integer) obj;
                    return;
                case 10:
                    this.A0G = (Integer) obj;
                    return;
                case 11:
                    this.A0D = (Integer) obj;
                    return;
                case 12:
                    this.A0E = (Integer) obj;
                    return;
                case 13:
                    this.A0F = (Integer) obj;
                    return;
                case 14:
                    this.A0J = (Integer) obj;
                    return;
                case 15:
                    this.A0K = (Integer) obj;
                    return;
                default:
                    switch (i) {
                        case 17:
                            this.A0M = (Integer) obj;
                            return;
                        case 18:
                            this.A0N = (Integer) obj;
                            return;
                        case 19:
                            this.A0O = (Integer) obj;
                            return;
                        default:
                            switch (i) {
                                case 21:
                                    this.A0L = (Integer) obj;
                                    return;
                                case 22:
                                    this.A0I = (Integer) obj;
                                    return;
                                case 23:
                                    this.A0P = (Integer) obj;
                                    return;
                                case 24:
                                    this.A0Q = (Integer) obj;
                                    return;
                                case 25:
                                    this.A0R = (Integer) obj;
                                    return;
                                default:
                                    Rect rect = null;
                                    switch (i) {
                                        case 30:
                                            this.A0A = (Double) obj;
                                            return;
                                        case 31:
                                            this.A0C = (Double) obj;
                                            return;
                                        case 32:
                                            this.A0B = (Double) obj;
                                            return;
                                        case 33:
                                            IBB ibb = (IBB) obj;
                                            this.A04 = ibb;
                                            if (ibb != null) {
                                                rect = new Rect(0, 0, ibb.A02, ibb.A01);
                                            }
                                            this.A01 = rect;
                                            return;
                                        case 34:
                                            IBB ibb2 = (IBB) obj;
                                            this.A03 = ibb2;
                                            if (ibb2 != null) {
                                                rect = new Rect(0, 0, ibb2.A02, ibb2.A01);
                                            }
                                            this.A00 = rect;
                                            return;
                                        case 35:
                                            this.A05 = (IBB) obj;
                                            return;
                                        case 36:
                                            this.A02 = (IBB) obj;
                                            return;
                                        case 37:
                                            this.A0U = HwV.A00((List) obj);
                                            return;
                                        case 38:
                                            this.A0V = HwV.A00((List) obj);
                                            return;
                                        case 39:
                                            int[] iArr = (int[]) obj;
                                            if (iArr == null || iArr.length != 2) {
                                                return;
                                            }
                                            int[] iArr2 = this.A0d;
                                            iArr2[0] = iArr[0];
                                            iArr2[1] = iArr[1];
                                            return;
                                        default:
                                            throw GOp.A16("Cannot directly set: ", i);
                                    }
                            }
                    }
            }
        }
    }

    public Object clone() {
        return super.clone();
    }
}
