package com.facebook.messaging.msys.facebookmessaging.extensions.datatranslator;

import X.0AC;
import X.0CX;
import X.0fH;
import X.11T;
import X.1BQ;
import X.1Bi;
import X.1qX;
import X.2yD;
import X.48N;
import X.48O;
import X.48P;
import X.48R;
import X.C00i;
import X.C0A2;
import X.C48g;
import X.C5pt;
import X.C66a;
import android.net.Uri;
import com.facebook.messaging.model.attachment.AttachmentImageMap;
import com.facebook.messaging.model.attachment.AudioData;
import com.facebook.messaging.model.attachment.ImageData;
import com.facebook.messaging.model.attachment.ImageUrl;
import com.facebook.messaging.model.attachment.VideoData;
import com.facebook.xapp.messaging.threadview.model.audio.WaveformData;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: MsysFacebookMessagingTempMessageAttachmentListUtil.class */
public final class MsysFacebookMessagingTempMessageAttachmentListUtil {
    public final Map A00 = Collections.synchronizedMap(new HashMap());
    public final C00i A01 = new 1BQ(46);

    public static 48O A00(Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Integer num4, Long l, Long l2, Long l3, Long l4, Long l5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i) {
        48P r344;
        ImageData A01;
        WaveformData waveformData;
        ImmutableList build;
        String str21 = str3;
        String str22 = str19;
        String str23 = str4;
        Uri uri = null;
        48O r0 = new 48O(str, str2);
        r0.A0E = str;
        if (i != 14) {
            switch (i) {
                case 1:
                    r344 = 48P.A0B;
                    break;
                case 2:
                    r344 = 48P.A07;
                    break;
                case 3:
                    r344 = 48P.A02;
                    break;
                case 4:
                    r344 = 48P.A0C;
                    break;
                case 5:
                    r344 = 48P.A03;
                    break;
                case 6:
                    r344 = 48P.A06;
                    break;
                case 7:
                    r344 = 48P.A0D;
                    break;
                case 8:
                    r344 = 48P.A04;
                    break;
                case 9:
                    r344 = 48P.A05;
                    break;
                case 10:
                    r344 = 48P.A0A;
                    break;
                default:
                    0fH.A17("com.facebook.messaging.msys.facebookmessaging.extensions.datatranslator.MsysFacebookMessagingTempMessageAttachmentListUtil", "Not supported attachment type: %d", new Object[]{Integer.valueOf(i)});
                    r344 = 48P.A08;
                    break;
            }
        } else {
            r344 = 48P.A09;
        }
        r0.A04 = r344;
        if (str3 == null) {
            str21 = "not available";
        }
        r0.A0F = str21;
        long j = -1;
        if (l != null) {
            j = l.longValue();
        }
        r0.A00 = (int) j;
        r0.A0D = str16;
        r0.A0J = str17;
        r0.A0A = null;
        long j2 = -1;
        if (l5 != null) {
            j2 = l5.longValue();
        }
        r0.A03 = j2;
        r0.A0K = str18;
        boolean z = false;
        r0.A0N = bool != null ? bool.booleanValue() : false;
        if (str19 == null) {
            str22 = "";
        }
        r0.A0C = str22;
        r0.A0G = str20;
        if (num4 != null) {
            r0.A09 = num4;
        }
        if (bool2 != null && bool2.booleanValue()) {
            z = true;
        }
        r0.A0M = Boolean.valueOf(z).booleanValue();
        if ((i == 2 || i == 8) && str5 != null) {
            r0.A0I = A04(str23, i);
            A01 = A01(num, num2, str5, str8, str9, str23, false);
        } else {
            if ((i != 3 && i != 14) || str8 == null) {
                if (i == 5) {
                    if (str5 != null) {
                        if (str4 == null) {
                            str23 = "audio/*";
                        }
                        r0.A0I = str23;
                        long j3 = 0;
                        if (l2 != null) {
                            j3 = l2.longValue();
                        }
                        if (str10 == null || num3 == null) {
                            waveformData = null;
                        } else {
                            ImmutableList.of();
                            2yD r02 = (2yD) 1Bi.A03(16385);
                            if (!r02.AZk(36323552034966174L) || str10.length() < r02.Auy(36605027011730389L)) {
                                ImmutableList.Builder builder = ImmutableList.builder();
                                StringBuilder sb = new StringBuilder();
                                int length = str10.length();
                                if (length >= 0) {
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 != length && str10.charAt(i2) != ',') {
                                            sb.append(str10.charAt(i2));
                                        } else if (sb.length() > 0) {
                                            String obj = sb.toString();
                                            11T.A0A(obj);
                                            Double A0h = 0CX.A0h(obj);
                                            if (A0h != null) {
                                                builder.m11011add((Object) A0h);
                                            }
                                            sb.setLength(0);
                                        }
                                        if (i2 != length) {
                                            i2++;
                                        }
                                    }
                                }
                                build = builder.build();
                            } else {
                                build = ImmutableList.of();
                            }
                            11T.A0A(build);
                            waveformData = new WaveformData(build, num3.intValue());
                        }
                        Uri uri2 = null;
                        try {
                            uri2 = C0A2.A03(str5);
                        } catch (SecurityException unused) {
                        }
                        r0.A05 = new AudioData(uri2, waveformData, l3, str2, str11, str12, str13, str14, str15, (int) (j3 / 1000), (int) j3, false);
                        return r0;
                    }
                } else if ((i == 4 || i == 9) && str5 != null) {
                    r0.A0I = A04(str23, i);
                    String str24 = str5;
                    if (str8 != null) {
                        str24 = str8;
                    }
                    int i3 = -1;
                    if (num != null) {
                        i3 = num.intValue();
                    }
                    int i4 = -1;
                    if (num2 != null) {
                        i4 = num2.intValue();
                    }
                    long j4 = 0;
                    if (l2 != null) {
                        j4 = l2.longValue();
                    }
                    int i5 = (int) (j4 / 1000);
                    C48g c48g = C48g.VIDEO_ATTACHMENT;
                    Uri uri3 = null;
                    try {
                        uri3 = C0A2.A03(str5);
                    } catch (SecurityException unused2) {
                    }
                    uri3.getClass();
                    try {
                        uri = C0A2.A03(str24);
                    } catch (SecurityException unused3) {
                    }
                    VideoData videoData = new VideoData(uri3, uri, c48g, str9, i3, i4, 0, i5, 0);
                    videoData.A0E = str6;
                    r0.A08 = videoData;
                    return r0;
                }
                r0.A0I = A04(null, i);
                if (i == 1) {
                    long j5 = 0;
                    if (l4 != null) {
                        j5 = l4.longValue();
                    }
                    r0.A01 = j5;
                    return r0;
                }
                return r0;
            }
            r0.A0I = A04(str7, i);
            A01 = A01(num, num2, str8, str8, str9, str7, true);
        }
        r0.A07 = A01;
        return r0;
    }

    public static ImageData A01(Integer num, Integer num2, String str, String str2, String str3, String str4, boolean z) {
        String str5 = str3;
        HashMap hashMap = new HashMap();
        C66a A00 = C66a.A00(str4);
        48N r0 = 48N.A02;
        int i = -1;
        if (num != null) {
            i = num.intValue();
        }
        int i2 = -1;
        if (num2 != null) {
            i2 = num2.intValue();
        }
        hashMap.put(r0, new ImageUrl(i2, str, i));
        if (str2 != null) {
            hashMap.put(48N.A03, new ImageUrl(i2, str2, i));
        }
        AttachmentImageMap attachmentImageMap = new AttachmentImageMap(A00, hashMap);
        int i3 = -1;
        if (num != null) {
            i3 = num.intValue();
        }
        int i4 = -1;
        if (num2 != null) {
            i4 = num2.intValue();
        }
        AttachmentImageMap attachmentImageMap2 = attachmentImageMap;
        if (!z) {
            attachmentImageMap2 = null;
        }
        48R r02 = 48R.A01;
        if (str3 == null) {
            str5 = "";
        }
        return new ImageData(attachmentImageMap, attachmentImageMap2, r02, str5, "", i3, i4, false);
    }

    public static String A02(MsysFacebookMessagingTempMessageAttachmentListUtil msysFacebookMessagingTempMessageAttachmentListUtil, C5pt c5pt, int i) {
        String string = ((1qX) c5pt).mResultSet.getString(i, 35);
        if (string == null) {
            string = ((0AC) msysFacebookMessagingTempMessageAttachmentListUtil.A01.get()).A03(((1qX) c5pt).mResultSet.getNullableLong(i, 19), ((1qX) c5pt).mResultSet.getString(i, 17), ((1qX) c5pt).mResultSet.getString(i, 18));
        }
        return string;
    }

    public static String A03(MsysFacebookMessagingTempMessageAttachmentListUtil msysFacebookMessagingTempMessageAttachmentListUtil, C5pt c5pt, int i) {
        return ((0AC) msysFacebookMessagingTempMessageAttachmentListUtil.A01.get()).A03(((1qX) c5pt).mResultSet.getNullableLong(i, 27), ((1qX) c5pt).mResultSet.getString(i, 25), ((1qX) c5pt).mResultSet.getString(i, 26));
    }

    public static String A04(String str, int i) {
        if (str == null) {
            if (i == 2 || i == 3) {
                return "image/*";
            }
            if (i == 4) {
                return "video/*";
            }
            if (i == 5) {
                return "audio/*";
            }
            if (i == 8) {
                return "image/*";
            }
            if (i == 9) {
                return "video/*";
            }
            if (i == 14) {
                return "image/*";
            }
            str = "*/*";
        }
        return str;
    }
}
