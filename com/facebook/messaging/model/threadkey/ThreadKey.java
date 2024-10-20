package com.facebook.messaging.model.threadkey;

import X.0S2;
import X.1Js;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1yg;
import X.C2xc;
import X.JQw;
import X.K93;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.acra.constants.ActionId;
import com.facebook.user.model.UserKey;
import com.google.common.base.Preconditions;
import java.util.Locale;

/* loaded from: ThreadKey.class */
public final class ThreadKey implements Parcelable {
    public String A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final C1yg A06;
    public static Long A08 = 0L;
    public static Long A07 = Long.valueOf(-14);
    public static final Parcelable.Creator CREATOR = new C2xc(27);

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0162, code lost:
    
        if (r305 <= r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0165, code lost:
    
        r313 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0168, code lost:
    
        com.google.common.base.Preconditions.checkArgument(r313);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0176, code lost:
    
        if (r307 <= r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0179, code lost:
    
        r313 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x017c, code lost:
    
        com.google.common.base.Preconditions.checkArgument(r313);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x018a, code lost:
    
        if (r309 != r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x018d, code lost:
    
        r313 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0190, code lost:
    
        com.google.common.base.Preconditions.checkArgument(r313);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x019e, code lost:
    
        if (r311 != r0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0221, code lost:
    
        r316 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x021b, code lost:
    
        com.google.common.base.Preconditions.checkArgument(r316);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0220, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x01a4, code lost:
    
        r313 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x01aa, code lost:
    
        r313 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x01b0, code lost:
    
        r313 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0151, code lost:
    
        r313 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f6, code lost:
    
        if (r307 == r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010e, code lost:
    
        if (r305 == r303) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x013d, code lost:
    
        if (r309 > r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x014e, code lost:
    
        if (r303 < 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0218, code lost:
    
        if (r311 != r0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00ba, code lost:
    
        if (r303 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x01b6, code lost:
    
        r313 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0154, code lost:
    
        com.google.common.base.Preconditions.checkArgument(r313);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0035. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ThreadKey(X.C1yg r302, long r303, long r305, long r307, long r309, long r311) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.<init>(X.1yg, long, long, long, long, long):void");
    }

    public static int A00(C1yg c1yg) {
        switch (c1yg) {
            case ONE_TO_ONE:
                return 1;
            case GROUP:
            case PENDING_THREAD:
            case PENDING_GENERAL_THREAD:
            case OPTIMISTIC_GROUP_THREAD:
                return 2;
            case FOLDER:
                return 6;
            case TINCAN:
            case TINCAN_MULTI_ENDPOINT:
                return 7;
            case SMS:
            case MONTAGE:
            default:
                throw AnonymousClass002.A0C(c1yg, "Unsupported ThreadKey type: ", AnonymousClass001.A0k());
            case ENCRYPTED_ONE_TO_ONE_DISAPPEARING:
                return 13;
            case CARRIER_MESSAGING_ONE_TO_ONE:
                return 10;
            case CARRIER_MESSAGING_GROUP:
                return 11;
            case ADVANCED_CRYPTO_ONE_TO_ONE:
            case OCCAMADILLO_ONE_TO_ONE:
            case INTEROP_ONE_TO_ONE:
                return 15;
            case ADVANCED_CRYPTO_GROUP:
            case OCCAMADILLO_GROUP:
                return 16;
            case COMMUNITY_CHANNEL:
                return 18;
            case SOCIAL_CHANNEL:
                return ActionId.APPLY_FINISHED_LIST_AGAIN;
            case BROADCAST_CHANNEL:
                return ActionId.APPLY_OPTIMISTICS;
            case COMMUNITY_SUB_THREAD:
                return 26;
            case AI_BOT:
                return 201;
            case MARKETPLACE:
                return 5;
        }
    }

    public static ThreadKey A01(long j) {
        long j2 = -1;
        return new ThreadKey(C1yg.ADVANCED_CRYPTO_GROUP, j2, j2, j2, j2, j);
    }

    public static ThreadKey A02(long j) {
        long j2 = -1;
        return new ThreadKey(C1yg.ADVANCED_CRYPTO_ONE_TO_ONE, j2, j2, j2, j2, j);
    }

    public static ThreadKey A03(long j) {
        long j2 = -1;
        return new ThreadKey(C1yg.COMMUNITY_CHANNEL, j, j2, j2, j2, j2);
    }

    public static ThreadKey A04(long j) {
        long j2 = -1;
        return new ThreadKey(C1yg.COMMUNITY_SUB_THREAD, j, j2, j2, j2, j2);
    }

    public static ThreadKey A05(long j) {
        long j2 = -1;
        return new ThreadKey(C1yg.BROADCAST_CHANNEL, j, j2, j2, j2, j2);
    }

    public static ThreadKey A06(long j) {
        long j2 = -1;
        return new ThreadKey(C1yg.SOCIAL_CHANNEL, j, j2, j2, j2, j2);
    }

    public static ThreadKey A07(long j) {
        long j2 = -1;
        return new ThreadKey(C1yg.FOLDER, j, j2, j2, j2, j2);
    }

    public static ThreadKey A08(long j) {
        long j2 = -1;
        return new ThreadKey(C1yg.GROUP, j, j2, j2, j2, j2);
    }

    public static ThreadKey A09(long j) {
        long j2 = -1;
        return new ThreadKey(C1yg.INTEROP_ONE_TO_ONE, j2, j2, j2, j2, j);
    }

    public static ThreadKey A0A(long j) {
        long j2 = -1;
        return new ThreadKey(C1yg.MARKETPLACE, j, j2, j2, j2, j2);
    }

    public static ThreadKey A0B(long j) {
        long j2 = -1;
        return new ThreadKey(C1yg.MONTAGE, j, j2, j2, j2, j2);
    }

    public static ThreadKey A0C(long j) {
        long j2 = -1;
        return new ThreadKey(C1yg.OCCAMADILLO_GROUP, j, j2, j2, j2, j2);
    }

    public static ThreadKey A0D(long j) {
        long j2 = -1;
        return new ThreadKey(C1yg.OCCAMADILLO_ONE_TO_ONE, j, j2, j2, j2, j2);
    }

    public static ThreadKey A0E(long j) {
        long j2 = -1;
        return new ThreadKey(C1yg.OPTIMISTIC_GROUP_THREAD, j2, j2, j2, j, j2);
    }

    public static ThreadKey A0F(long j, long j2) {
        long j3 = -1;
        return new ThreadKey(C1yg.AI_BOT, j3, j, j2, j3, j3);
    }

    public static ThreadKey A0G(long j, long j2) {
        long j3 = -1;
        return new ThreadKey(C1yg.ENCRYPTED_ONE_TO_ONE_DISAPPEARING, -j, j, j2, j3, j3);
    }

    public static ThreadKey A0H(long j, long j2) {
        long j3 = -1;
        return new ThreadKey(C1yg.ONE_TO_ONE, j3, j, j2, j3, j3);
    }

    public static ThreadKey A0I(long j, long j2) {
        long j3 = -1;
        return new ThreadKey(C1yg.TINCAN, j, j, j2, j3, j3);
    }

    public static ThreadKey A0J(long j, long j2) {
        long abs = Math.abs(j);
        return j < 0 ? A0G(abs, j2) : A0I(abs, j2);
    }

    public static ThreadKey A0K(String str, boolean z) {
        String[] split;
        int length;
        ThreadKey A0I;
        if (str == null || (length = (split = str.split(":")).length) < 1) {
            return null;
        }
        try {
            C1yg valueOf = C1yg.valueOf(split[0]);
            if (valueOf == C1yg.ONE_TO_ONE && length == 3) {
                A0I = A0H(Long.parseLong(split[1]), Long.parseLong(split[2]));
            } else if (valueOf == C1yg.GROUP && length == 2) {
                A0I = A08(Long.parseLong(split[1]));
            } else if (valueOf == C1yg.MARKETPLACE && length == 2) {
                A0I = A0A(Long.parseLong(split[1]));
            } else if (valueOf == C1yg.FOLDER && length == 2) {
                A0I = A07(Long.parseLong(split[1]));
            } else if (valueOf == C1yg.MONTAGE && length == 2) {
                A0I = A0B(Long.parseLong(split[1]));
            } else {
                long j = 0;
                if (valueOf == C1yg.TINCAN || valueOf == C1yg.TINCAN_MULTI_ENDPOINT) {
                    if (length != 2) {
                        if (length == 3) {
                            j = Long.parseLong(split[2]);
                        }
                    }
                    A0I = A0I(Long.parseLong(split[1]), j);
                }
                if (valueOf == C1yg.OPTIMISTIC_GROUP_THREAD && length == 2) {
                    A0I = A0E(Long.parseLong(split[1]));
                } else {
                    C1yg c1yg = C1yg.PENDING_THREAD;
                    if (valueOf == c1yg && length == 2) {
                        long parseLong = Long.parseLong(split[1]);
                        long j2 = -1;
                        new ThreadKey(c1yg, j2, j2, j2, parseLong, j2);
                    } else {
                        C1yg c1yg2 = C1yg.PENDING_GENERAL_THREAD;
                        if (valueOf == c1yg2 && length == 2) {
                            long parseLong2 = Long.parseLong(split[1]);
                            long j3 = -1;
                            new ThreadKey(c1yg2, j3, j3, j3, parseLong2, j3);
                        } else if (valueOf == C1yg.ENCRYPTED_ONE_TO_ONE_DISAPPEARING) {
                            if (length == 3) {
                                j = Long.parseLong(split[2]);
                            }
                            A0I = A0G(Long.parseLong(split[1]), j);
                        } else if (valueOf == C1yg.ADVANCED_CRYPTO_GROUP && length == 2) {
                            A0I = A01(Long.parseLong(split[1]));
                        } else if (valueOf == C1yg.ADVANCED_CRYPTO_ONE_TO_ONE && length == 2) {
                            A0I = A02(Long.parseLong(split[1]));
                        } else if (valueOf == C1yg.OCCAMADILLO_ONE_TO_ONE && length == 2) {
                            A0I = A0D(Long.parseLong(split[1]));
                        } else if (valueOf == C1yg.OCCAMADILLO_GROUP && length == 2) {
                            A0I = A0C(Long.parseLong(split[1]));
                        } else if (valueOf == C1yg.COMMUNITY_CHANNEL && length == 2) {
                            A0I = A03(Long.parseLong(split[1]));
                        } else if (valueOf == C1yg.COMMUNITY_SUB_THREAD && length == 2) {
                            A0I = A04(Long.parseLong(split[1]));
                        } else if (valueOf == C1yg.SOCIAL_CHANNEL && length == 2) {
                            A0I = A06(Long.parseLong(split[1]));
                        } else if (valueOf == C1yg.BROADCAST_CHANNEL && length == 2) {
                            A0I = A05(Long.parseLong(split[1]));
                        } else if (valueOf == C1yg.AI_BOT && length == 3) {
                            A0I = A0F(Long.parseLong(split[1]), Long.parseLong(split[2]));
                        } else {
                            if (valueOf != C1yg.INTEROP_ONE_TO_ONE || length != 2) {
                                return null;
                            }
                            A0I = A09(Long.parseLong(split[1]));
                        }
                    }
                }
            }
            A0I.A00 = str;
            return A0I;
        } catch (Exception e) {
            if (z) {
                return null;
            }
            throw e;
        }
    }

    public static UserKey A0L(ThreadKey threadKey) {
        if (!A0j(threadKey) && !A0q(threadKey)) {
            return null;
        }
        return new UserKey(1Js.A03, Long.toString(threadKey.A02));
    }

    public static Integer A0M(ThreadKey threadKey) {
        return (threadKey == null || !(threadKey.A1B() || threadKey.A11())) ? 0S2.A00 : 0S2.A01;
    }

    public static String A0N(ThreadKey threadKey) {
        return Base64.encodeToString(AnonymousClass001.A0h(AnonymousClass001.A0n("message_thread:"), threadKey.A0r()).getBytes(), 11);
    }

    public static String A0O(ThreadKey threadKey) {
        C1yg c1yg = threadKey.A06;
        int ordinal = c1yg.ordinal();
        return (ordinal == 3 || ordinal == 4) ? "encrypted_one_to_one" : c1yg.toString().toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r301.A0w() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0P(com.facebook.messaging.model.threadkey.ThreadKey r301) {
        /*
            r0 = r301
            if (r0 == 0) goto Lf
            r0 = r301
            boolean r0 = r0.A0w()
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 != 0) goto L11
        Lf:
            r0 = 0
            r303 = r0
        L11:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A0P(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r301.A0x() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0Q(com.facebook.messaging.model.threadkey.ThreadKey r301) {
        /*
            r0 = r301
            if (r0 == 0) goto Lf
            r0 = r301
            boolean r0 = r0.A0x()
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 != 0) goto L11
        Lf:
            r0 = 0
            r303 = r0
        L11:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A0Q(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r301.A0y() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0R(com.facebook.messaging.model.threadkey.ThreadKey r301) {
        /*
            r0 = r301
            if (r0 == 0) goto Lf
            r0 = r301
            boolean r0 = r0.A0y()
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 != 0) goto L11
        Lf:
            r0 = 0
            r303 = r0
        L11:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A0R(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r301.A0z() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0S(com.facebook.messaging.model.threadkey.ThreadKey r301) {
        /*
            r0 = r301
            if (r0 == 0) goto Lf
            r0 = r301
            boolean r0 = r0.A0z()
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 != 0) goto L11
        Lf:
            r0 = 0
            r303 = r0
        L11:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A0S(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    public static boolean A0T(ThreadKey threadKey) {
        if (threadKey == null) {
            return false;
        }
        C1yg c1yg = threadKey.A06;
        return c1yg == C1yg.SOCIAL_CHANNEL || c1yg == C1yg.BROADCAST_CHANNEL;
    }

    public static boolean A0U(ThreadKey threadKey) {
        if (threadKey != null) {
            return threadKey.A0z() || threadKey.A17() || threadKey.A1H();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r301.A1H() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0V(com.facebook.messaging.model.threadkey.ThreadKey r301) {
        /*
            r0 = r301
            if (r0 == 0) goto Lf
            r0 = r301
            boolean r0 = r0.A1H()
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 != 0) goto L11
        Lf:
            r0 = 0
            r303 = r0
        L11:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A0V(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    public static boolean A0W(ThreadKey threadKey) {
        if (threadKey == null) {
            return false;
        }
        C1yg c1yg = threadKey.A06;
        return c1yg == C1yg.ONE_TO_ONE || c1yg == C1yg.CARRIER_MESSAGING_ONE_TO_ONE || c1yg == C1yg.ADVANCED_CRYPTO_ONE_TO_ONE || c1yg == C1yg.ENCRYPTED_ONE_TO_ONE_DISAPPEARING || c1yg == C1yg.OCCAMADILLO_ONE_TO_ONE || c1yg == C1yg.INTEROP_ONE_TO_ONE || A0q(threadKey);
    }

    public static boolean A0X(ThreadKey threadKey) {
        if (threadKey == null) {
            return false;
        }
        C1yg c1yg = threadKey.A06;
        return c1yg == C1yg.GROUP || c1yg == C1yg.MARKETPLACE || c1yg == C1yg.CARRIER_MESSAGING_GROUP || c1yg == C1yg.ADVANCED_CRYPTO_GROUP || c1yg == C1yg.OCCAMADILLO_GROUP || c1yg == C1yg.OPTIMISTIC_GROUP_THREAD;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r301.A10() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0Y(com.facebook.messaging.model.threadkey.ThreadKey r301) {
        /*
            r0 = r301
            if (r0 == 0) goto Lf
            r0 = r301
            boolean r0 = r0.A10()
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 != 0) goto L11
        Lf:
            r0 = 0
            r303 = r0
        L11:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A0Y(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.A06 != X.C1yg.CARRIER_MESSAGING_GROUP) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0Z(com.facebook.messaging.model.threadkey.ThreadKey r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L14
            r0 = r301
            X.1yg r0 = r0.A06
            r301 = r0
            X.1yg r0 = X.C1yg.CARRIER_MESSAGING_GROUP
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L16
        L14:
            r0 = 0
            r303 = r0
        L16:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A0Z(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.A06 != X.C1yg.COMMUNITY_CHANNEL) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0a(com.facebook.messaging.model.threadkey.ThreadKey r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L14
            r0 = r301
            X.1yg r0 = r0.A06
            r301 = r0
            X.1yg r0 = X.C1yg.COMMUNITY_CHANNEL
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L16
        L14:
            r0 = 0
            r303 = r0
        L16:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A0a(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (A0c(r301) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0b(com.facebook.messaging.model.threadkey.ThreadKey r301) {
        /*
            r0 = r301
            boolean r0 = A0a(r0)
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L14
            r0 = r301
            boolean r0 = A0c(r0)
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L16
        L14:
            r0 = 1
            r302 = r0
        L16:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A0b(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.A06 != X.C1yg.COMMUNITY_SUB_THREAD) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0c(com.facebook.messaging.model.threadkey.ThreadKey r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L14
            r0 = r301
            X.1yg r0 = r0.A06
            r301 = r0
            X.1yg r0 = X.C1yg.COMMUNITY_SUB_THREAD
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L16
        L14:
            r0 = 0
            r303 = r0
        L16:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A0c(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.A06 != X.C1yg.ENCRYPTED_ONE_TO_ONE_DISAPPEARING) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0d(com.facebook.messaging.model.threadkey.ThreadKey r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L14
            r0 = r301
            X.1yg r0 = r0.A06
            r301 = r0
            X.1yg r0 = X.C1yg.ENCRYPTED_ONE_TO_ONE_DISAPPEARING
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L16
        L14:
            r0 = 0
            r303 = r0
        L16:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A0d(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.A06 != X.C1yg.BROADCAST_CHANNEL) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0e(com.facebook.messaging.model.threadkey.ThreadKey r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L14
            r0 = r301
            X.1yg r0 = r0.A06
            r301 = r0
            X.1yg r0 = X.C1yg.BROADCAST_CHANNEL
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L16
        L14:
            r0 = 0
            r303 = r0
        L16:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A0e(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.A06 != X.C1yg.GROUP) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0f(com.facebook.messaging.model.threadkey.ThreadKey r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L14
            r0 = r301
            X.1yg r0 = r0.A06
            r301 = r0
            X.1yg r0 = X.C1yg.GROUP
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L16
        L14:
            r0 = 0
            r303 = r0
        L16:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A0f(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r301.A1G() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0g(com.facebook.messaging.model.threadkey.ThreadKey r301) {
        /*
            r0 = r301
            if (r0 == 0) goto Lf
            r0 = r301
            boolean r0 = r0.A1G()
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 != 0) goto L11
        Lf:
            r0 = 0
            r303 = r0
        L11:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A0g(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r301.A1I() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0h(com.facebook.messaging.model.threadkey.ThreadKey r301) {
        /*
            r0 = r301
            if (r0 == 0) goto Lf
            r0 = r301
            boolean r0 = r0.A1I()
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 != 0) goto L11
        Lf:
            r0 = 0
            r303 = r0
        L11:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A0h(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r301.A1J() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0i(com.facebook.messaging.model.threadkey.ThreadKey r301) {
        /*
            r0 = r301
            if (r0 == 0) goto Lf
            r0 = r301
            boolean r0 = r0.A1J()
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 != 0) goto L11
        Lf:
            r0 = 0
            r303 = r0
        L11:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A0i(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.A06 != X.C1yg.ONE_TO_ONE) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0j(com.facebook.messaging.model.threadkey.ThreadKey r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L14
            r0 = r301
            X.1yg r0 = r0.A06
            r301 = r0
            X.1yg r0 = X.C1yg.ONE_TO_ONE
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L16
        L14:
            r0 = 0
            r303 = r0
        L16:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A0j(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r301.A1N() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0k(com.facebook.messaging.model.threadkey.ThreadKey r301) {
        /*
            r0 = r301
            if (r0 == 0) goto Lf
            r0 = r301
            boolean r0 = r0.A1N()
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r302
            if (r0 != 0) goto L11
        Lf:
            r0 = 0
            r303 = r0
        L11:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A0k(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.A06 != X.C1yg.OPTIMISTIC_GROUP_THREAD) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0l(com.facebook.messaging.model.threadkey.ThreadKey r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L14
            r0 = r301
            X.1yg r0 = r0.A06
            r301 = r0
            X.1yg r0 = X.C1yg.OPTIMISTIC_GROUP_THREAD
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L16
        L14:
            r0 = 0
            r303 = r0
        L16:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A0l(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    public static boolean A0m(ThreadKey threadKey) {
        if (threadKey == null) {
            return false;
        }
        C1yg c1yg = threadKey.A06;
        return c1yg == C1yg.PENDING_THREAD || c1yg == C1yg.PENDING_GENERAL_THREAD;
    }

    public static boolean A0n(ThreadKey threadKey) {
        if (threadKey == null) {
            return false;
        }
        C1yg c1yg = threadKey.A06;
        return c1yg == C1yg.TINCAN || c1yg == C1yg.TINCAN_MULTI_ENDPOINT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r301.A06 != X.C1yg.SMS) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0o(com.facebook.messaging.model.threadkey.ThreadKey r301) {
        /*
            r0 = r301
            if (r0 == 0) goto L14
            r0 = r301
            X.1yg r0 = r0.A06
            r301 = r0
            X.1yg r0 = X.C1yg.SMS
            r302 = r0
            r0 = 1
            r303 = r0
            r0 = r301
            r1 = r302
            if (r0 == r1) goto L16
        L14:
            r0 = 0
            r303 = r0
        L16:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A0o(com.facebook.messaging.model.threadkey.ThreadKey):boolean");
    }

    public static boolean A0p(ThreadKey threadKey) {
        if (threadKey != null) {
            return threadKey.A06 == C1yg.SMS || threadKey.A10();
        }
        return false;
    }

    public static boolean A0q(ThreadKey threadKey) {
        if (threadKey == null) {
            return false;
        }
        C1yg c1yg = threadKey.A06;
        return c1yg == C1yg.TINCAN || c1yg == C1yg.TINCAN_MULTI_ENDPOINT || c1yg == C1yg.ENCRYPTED_ONE_TO_ONE_DISAPPEARING;
    }

    public long A0r() {
        C1yg c1yg = this.A06;
        return (c1yg == C1yg.ONE_TO_ONE || c1yg == C1yg.TINCAN || c1yg == C1yg.TINCAN_MULTI_ENDPOINT || c1yg == C1yg.AI_BOT) ? this.A02 : this.A04;
    }

    public long A0s() {
        C1yg c1yg = this.A06;
        long A0r = (c1yg == C1yg.CARRIER_MESSAGING_ONE_TO_ONE || c1yg == C1yg.CARRIER_MESSAGING_GROUP || c1yg == C1yg.ADVANCED_CRYPTO_ONE_TO_ONE || c1yg == C1yg.ADVANCED_CRYPTO_GROUP || c1yg == C1yg.INTEROP_ONE_TO_ONE) ? this.A01 : (c1yg == C1yg.OPTIMISTIC_GROUP_THREAD || c1yg == C1yg.PENDING_GENERAL_THREAD || c1yg == C1yg.PENDING_THREAD) ? this.A03 : A0r();
        boolean z = false;
        if (A0r != -1) {
            z = true;
        }
        Preconditions.checkState(z, "msys threadKey cannot be -1");
        return A0r;
    }

    public String A0t() {
        long max;
        StringBuilder sb;
        String str;
        int ordinal = this.A06.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                sb = new StringBuilder();
                str = "f";
            } else if (ordinal == 7) {
                sb = AnonymousClass001.A0k();
                str = K93.__redex_internal_original_name;
            } else if (ordinal == 1 || ordinal == 23) {
                sb = new StringBuilder();
                str = "g";
            } else {
                if (ordinal != 9) {
                    return "unknown";
                }
                sb = AnonymousClass001.A0k();
                str = "m";
            }
            sb.append(str);
            max = this.A04;
        } else {
            long j = this.A05;
            long j2 = this.A02;
            long min = Math.min(j, j2);
            max = Math.max(j, j2);
            sb = new StringBuilder();
            sb.append(min);
            sb.append("u");
        }
        sb.append(max);
        return sb.toString();
    }

    public String A0u() {
        StringBuilder sb;
        long j;
        C1yg c1yg;
        String name;
        String str = this.A00;
        if (str == null) {
            C1yg c1yg2 = this.A06;
            switch (c1yg2) {
                case ONE_TO_ONE:
                case AI_BOT:
                    sb = new StringBuilder();
                    name = c1yg2.name();
                    sb.append(name);
                    sb.append(":");
                    sb.append(this.A02);
                    sb.append(":");
                    j = this.A05;
                    sb.append(j);
                    str = sb.toString();
                    break;
                case GROUP:
                case FOLDER:
                case SMS:
                case MONTAGE:
                case OCCAMADILLO_ONE_TO_ONE:
                case OCCAMADILLO_GROUP:
                case COMMUNITY_CHANNEL:
                case SOCIAL_CHANNEL:
                case BROADCAST_CHANNEL:
                case COMMUNITY_SUB_THREAD:
                case MARKETPLACE:
                    sb = new StringBuilder();
                    sb.append(c1yg2.name());
                    sb.append(":");
                    j = this.A04;
                    sb.append(j);
                    str = sb.toString();
                    break;
                case TINCAN:
                case TINCAN_MULTI_ENDPOINT:
                    sb = AnonymousClass001.A0k();
                    c1yg = C1yg.TINCAN;
                    name = c1yg.name();
                    sb.append(name);
                    sb.append(":");
                    sb.append(this.A02);
                    sb.append(":");
                    j = this.A05;
                    sb.append(j);
                    str = sb.toString();
                    break;
                case PENDING_THREAD:
                case PENDING_GENERAL_THREAD:
                case OPTIMISTIC_GROUP_THREAD:
                    sb = AnonymousClass001.A0k();
                    sb.append(c1yg2.name());
                    sb.append(":");
                    j = this.A03;
                    sb.append(j);
                    str = sb.toString();
                    break;
                case ENCRYPTED_ONE_TO_ONE_DISAPPEARING:
                    sb = AnonymousClass001.A0k();
                    c1yg = C1yg.ENCRYPTED_ONE_TO_ONE_DISAPPEARING;
                    name = c1yg.name();
                    sb.append(name);
                    sb.append(":");
                    sb.append(this.A02);
                    sb.append(":");
                    j = this.A05;
                    sb.append(j);
                    str = sb.toString();
                    break;
                case CARRIER_MESSAGING_ONE_TO_ONE:
                case CARRIER_MESSAGING_GROUP:
                case ADVANCED_CRYPTO_ONE_TO_ONE:
                case ADVANCED_CRYPTO_GROUP:
                case INTEROP_ONE_TO_ONE:
                    sb = new StringBuilder();
                    sb.append(c1yg2.name());
                    sb.append(":");
                    j = this.A01;
                    sb.append(j);
                    str = sb.toString();
                    break;
                default:
                    str = JQw.A00(198);
                    break;
            }
            this.A00 = str;
        }
        return str;
    }

    public String A0v() {
        return String.valueOf(A0s());
    }

    public boolean A0w() {
        boolean z = false;
        if (this.A06 == C1yg.ADVANCED_CRYPTO_GROUP) {
            z = true;
        }
        return z;
    }

    public boolean A0x() {
        boolean z = false;
        if (this.A06 == C1yg.ADVANCED_CRYPTO_ONE_TO_ONE) {
            z = true;
        }
        return z;
    }

    public boolean A0y() {
        boolean z = false;
        if (this.A06 == C1yg.AI_BOT) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0 == X.C1yg.ADVANCED_CRYPTO_ONE_TO_ONE) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0z() {
        /*
            r301 = this;
            r0 = r301
            X.1yg r0 = r0.A06
            r302 = r0
            X.1yg r0 = X.C1yg.ADVANCED_CRYPTO_GROUP
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L1c
            X.1yg r0 = X.C1yg.ADVANCED_CRYPTO_ONE_TO_ONE
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A0z():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0 == X.C1yg.CARRIER_MESSAGING_GROUP) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A10() {
        /*
            r301 = this;
            r0 = r301
            X.1yg r0 = r0.A06
            r302 = r0
            X.1yg r0 = X.C1yg.CARRIER_MESSAGING_ONE_TO_ONE
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L1c
            X.1yg r0 = X.C1yg.CARRIER_MESSAGING_GROUP
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A10():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (A1D() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A11() {
        /*
            r301 = this;
            r0 = r301
            X.1yg r0 = r0.A06
            r302 = r0
            X.1yg r0 = X.C1yg.SOCIAL_CHANNEL
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L1c
            r0 = r301
            boolean r0 = r0.A1D()
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L1f
        L1c:
            r0 = 1
            r305 = r0
        L1f:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A11():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (A13() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A12() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A14()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L14
            r0 = r301
            boolean r0 = r0.A13()
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L16
        L14:
            r0 = 1
            r302 = r0
        L16:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A12():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (A0w() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A13() {
        /*
            r301 = this;
            r0 = r301
            X.1yg r0 = r0.A06
            r302 = r0
            X.1yg r0 = X.C1yg.OCCAMADILLO_GROUP
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L1c
            r0 = r301
            boolean r0 = r0.A0w()
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L1f
        L1c:
            r0 = 1
            r305 = r0
        L1f:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A13():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (A1H() != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A14() {
        /*
            r301 = this;
            r0 = r301
            X.1yg r0 = r0.A06
            r302 = r0
            X.1yg r0 = X.C1yg.OCCAMADILLO_ONE_TO_ONE
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L25
            r0 = r301
            boolean r0 = r0.A0x()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L25
            r0 = r301
            boolean r0 = r0.A1H()
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r302 = r0
            r0 = r304
            if (r0 == 0) goto L28
        L25:
            r0 = 1
            r305 = r0
        L28:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A14():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r0 == X.C1yg.BROADCAST_CHANNEL) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A15() {
        /*
            r301 = this;
            r0 = r301
            X.1yg r0 = r0.A06
            r302 = r0
            X.1yg r0 = X.C1yg.GROUP
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L52
            X.1yg r0 = X.C1yg.MARKETPLACE
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L52
            X.1yg r0 = X.C1yg.CARRIER_MESSAGING_GROUP
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L52
            X.1yg r0 = X.C1yg.ADVANCED_CRYPTO_GROUP
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L52
            X.1yg r0 = X.C1yg.OPTIMISTIC_GROUP_THREAD
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L52
            X.1yg r0 = X.C1yg.OCCAMADILLO_GROUP
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L52
            X.1yg r0 = X.C1yg.SOCIAL_CHANNEL
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L52
            X.1yg r0 = X.C1yg.BROADCAST_CHANNEL
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L55
        L52:
            r0 = 1
            r305 = r0
        L55:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A15():boolean");
    }

    public boolean A16() {
        boolean z = false;
        if (this.A06 == C1yg.INTEROP_ONE_TO_ONE) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0 == X.C1yg.OCCAMADILLO_GROUP) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A17() {
        /*
            r301 = this;
            r0 = r301
            X.1yg r0 = r0.A06
            r302 = r0
            X.1yg r0 = X.C1yg.OCCAMADILLO_ONE_TO_ONE
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L1c
            X.1yg r0 = X.C1yg.OCCAMADILLO_GROUP
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A17():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r0 == X.C1yg.INTEROP_ONE_TO_ONE) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A18() {
        /*
            r301 = this;
            r0 = r301
            X.1yg r0 = r0.A06
            r302 = r0
            X.1yg r0 = X.C1yg.ONE_TO_ONE
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L40
            X.1yg r0 = X.C1yg.CARRIER_MESSAGING_ONE_TO_ONE
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L40
            X.1yg r0 = X.C1yg.ADVANCED_CRYPTO_ONE_TO_ONE
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L40
            X.1yg r0 = X.C1yg.ENCRYPTED_ONE_TO_ONE_DISAPPEARING
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L40
            X.1yg r0 = X.C1yg.OCCAMADILLO_ONE_TO_ONE
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L40
            X.1yg r0 = X.C1yg.INTEROP_ONE_TO_ONE
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L43
        L40:
            r0 = 1
            r305 = r0
        L43:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A18():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r0 == X.C1yg.ENCRYPTED_ONE_TO_ONE_DISAPPEARING) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A19() {
        /*
            r301 = this;
            r0 = r301
            X.1yg r0 = r0.A06
            r302 = r0
            X.1yg r0 = X.C1yg.TINCAN
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L25
            X.1yg r0 = X.C1yg.TINCAN_MULTI_ENDPOINT
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L25
            X.1yg r0 = X.C1yg.ENCRYPTED_ONE_TO_ONE_DISAPPEARING
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L28
        L25:
            r0 = 1
            r305 = r0
        L28:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A19():boolean");
    }

    public boolean A1A() {
        boolean z = false;
        if (this.A06 == C1yg.COMMUNITY_CHANNEL) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (A1C() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1B() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A1A()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L14
            r0 = r301
            boolean r0 = r0.A1C()
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L16
        L14:
            r0 = 1
            r302 = r0
        L16:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A1B():boolean");
    }

    public boolean A1C() {
        boolean z = false;
        if (this.A06 == C1yg.COMMUNITY_SUB_THREAD) {
            z = true;
        }
        return z;
    }

    public boolean A1D() {
        boolean z = false;
        if (this.A06 == C1yg.BROADCAST_CHANNEL) {
            z = true;
        }
        return z;
    }

    public boolean A1E() {
        boolean z = false;
        if (this.A06 == C1yg.FOLDER) {
            z = true;
        }
        return z;
    }

    public boolean A1F() {
        boolean z = false;
        if (this.A06 == C1yg.GROUP) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r0 == X.C1yg.BROADCAST_CHANNEL) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1G() {
        /*
            r301 = this;
            r0 = r301
            X.1yg r0 = r0.A06
            r302 = r0
            X.1yg r0 = X.C1yg.GROUP
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L40
            X.1yg r0 = X.C1yg.MARKETPLACE
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L40
            X.1yg r0 = X.C1yg.PENDING_THREAD
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L40
            X.1yg r0 = X.C1yg.OPTIMISTIC_GROUP_THREAD
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L40
            X.1yg r0 = X.C1yg.SOCIAL_CHANNEL
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L40
            X.1yg r0 = X.C1yg.BROADCAST_CHANNEL
            r304 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            r1 = r304
            if (r0 != r1) goto L43
        L40:
            r0 = 1
            r305 = r0
        L43:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A1G():boolean");
    }

    public boolean A1H() {
        boolean z = false;
        if (this.A06 == C1yg.INTEROP_ONE_TO_ONE) {
            z = true;
        }
        return z;
    }

    public boolean A1I() {
        boolean z = false;
        if (this.A06 == C1yg.MARKETPLACE) {
            z = true;
        }
        return z;
    }

    public boolean A1J() {
        boolean z = false;
        if (this.A06 == C1yg.MONTAGE) {
            z = true;
        }
        return z;
    }

    public boolean A1K() {
        boolean z = false;
        if (this.A06 == C1yg.ONE_TO_ONE) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (A1F() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1L() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A1K()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L14
            r0 = r301
            boolean r0 = r0.A1F()
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L16
        L14:
            r0 = 1
            r302 = r0
        L16:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A1L():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (A1G() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1M() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A1N()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L26
            r0 = r301
            boolean r0 = r0.A1A()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L26
            r0 = r301
            boolean r0 = r0.A1C()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L26
            r0 = r301
            boolean r0 = r0.A1G()
            r303 = r0
            r0 = 0
            r302 = r0
            r0 = r303
            if (r0 == 0) goto L28
        L26:
            r0 = 1
            r302 = r0
        L28:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A1M():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (A1D() != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1N() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A1K()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L40
            r0 = r301
            boolean r0 = r0.A1F()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L40
            r0 = r301
            boolean r0 = r0.A1I()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L40
            r0 = r301
            boolean r0 = r0.A1O()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L40
            r0 = r301
            X.1yg r0 = r0.A06
            r303 = r0
            X.1yg r0 = X.C1yg.SOCIAL_CHANNEL
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 == r1) goto L40
            r0 = r301
            boolean r0 = r0.A1D()
            r302 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r303 = r0
            r0 = r302
            if (r0 == 0) goto L43
        L40:
            r0 = 1
            r305 = r0
        L43:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A1N():boolean");
    }

    public boolean A1O() {
        boolean z = false;
        if (this.A06 == C1yg.OPTIMISTIC_GROUP_THREAD) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r0 == X.C1yg.PENDING_GENERAL_THREAD) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1P() {
        /*
            r301 = this;
            r0 = r301
            X.1yg r0 = r0.A06
            r302 = r0
            X.1yg r0 = X.C1yg.PENDING_THREAD
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L1c
            X.1yg r0 = X.C1yg.PENDING_GENERAL_THREAD
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A1P():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r301.A02 != r301.A05) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1Q() {
        /*
            r301 = this;
            r0 = r301
            X.1yg r0 = r0.A06
            r302 = r0
            X.1yg r0 = X.C1yg.ONE_TO_ONE
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 != r1) goto L27
            r0 = r301
            long r0 = r0.A02
            r304 = r0
            r0 = r301
            long r0 = r0.A05
            r306 = r0
            r0 = r304
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r308 = r0
            r0 = 1
            r309 = r0
            r0 = r308
            if (r0 == 0) goto L2c
        L27:
            r0 = 0
            r309 = r0
            r0 = 0
            r303 = r0
        L2c:
            r0 = r309
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A1Q():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r301.A02 != r301.A05) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A1R() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A1F()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L2a
            r0 = r301
            boolean r0 = r0.A1J()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L2a
            r0 = r301
            long r0 = r0.A02
            r303 = r0
            r0 = r301
            long r0 = r0.A05
            r305 = r0
            r0 = r303
            r1 = r305
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r307 = r0
            r0 = 1
            r302 = r0
            r0 = r307
            if (r0 == 0) goto L2c
        L2a:
            r0 = 0
            r302 = r0
        L2c:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.model.threadkey.ThreadKey.A1R():boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ThreadKey threadKey = (ThreadKey) obj;
            if (this.A06 != threadKey.A06 || this.A02 != threadKey.A02 || this.A04 != threadKey.A04 || this.A05 != threadKey.A05 || this.A03 != threadKey.A03 || this.A01 != threadKey.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.A06.hashCode() * 31;
        long j = this.A04;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.A02;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.A05;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.A03;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.A01;
        return i4 + ((int) (j5 ^ (j5 >>> 32)));
    }

    public String toString() {
        return A0u();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A06.name());
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A01);
    }
}
