package X;

import com.facebook.messaging.threadview.jumppill.UnopenedContentPillController;
import com.facebook.threadview.ThreadViewMessagesRecyclerView;
import com.google.common.collect.ImmutableList;

/* renamed from: X.7ub, reason: invalid class name */
/* loaded from: 7ub.class */
public final class C7ub {
    public static void A00(6Mr r301, C6F9 c6f9) {
        UnopenedContentPillController unopenedContentPillController;
        int firstMessageCollectionPosition;
        if (r301 == null || (unopenedContentPillController = r301.A09) == null || (firstMessageCollectionPosition = unopenedContentPillController.getFirstMessageCollectionPosition()) == ((-1) << (-1))) {
            return;
        }
        if (firstMessageCollectionPosition >= 0) {
            unopenedContentPillController.unopenedMessageLoadCompleted();
        } else {
            if (unopenedContentPillController.messageLoadRequested) {
                return;
            }
            c6f9.BYi((-firstMessageCollectionPosition) + 5);
            unopenedContentPillController.unopenedMessageLoadRequested();
        }
    }

    public static void A01(6Fh r301, int i) {
        C6Ff c6Ff = (C6Ff) r301;
        ThreadViewMessagesRecyclerView threadViewMessagesRecyclerView = c6Ff.A0N;
        if (threadViewMessagesRecyclerView != null) {
            threadViewMessagesRecyclerView.A0q();
        }
        if (Math.abs((c6Ff.A07.A1h() > i ? c6Ff.A07.A1h() : c6Ff.A07.A1j()) - i) > 40) {
            c6Ff.A07.Cjt(i, c6Ff.A0N.getHeight() / 2);
            return;
        }
        ThreadViewMessagesRecyclerView threadViewMessagesRecyclerView2 = c6Ff.A0N;
        if (threadViewMessagesRecyclerView2 != null) {
            threadViewMessagesRecyclerView2.A0w(i);
        }
    }

    public void A02(6Mr r302, C6F9 c6f9, 6Fh r304) {
        6Mz r0;
        C7aB c7aB;
        if (r302 == null || (r0 = r302.A07) == null) {
            return;
        }
        int i = r0.A00;
        if (i < 0) {
            i = 6Mz.A00(r0);
            r0.A00 = i;
            if (i < 0) {
                int i2 = r0.A01;
                long j = r0.A02;
                C6Ff c6Ff = (C6Ff) r0.A0C;
                int size = c6Ff.A0Q.size();
                while (true) {
                    size--;
                    ImmutableList immutableList = c6Ff.A0Q;
                    if (-1 >= size) {
                        size = immutableList.size() - 1;
                        break;
                    }
                    AnonymousClass626 anonymousClass626 = (AnonymousClass626) immutableList.get(size);
                    11T.A0A(anonymousClass626);
                    if ((anonymousClass626 instanceof AnonymousClass622) && anonymousClass626.AsR() == j) {
                        break;
                    }
                }
                while (true) {
                    if (-1 < size) {
                        AnonymousClass624 anonymousClass624 = (AnonymousClass624) c6Ff.A0Q.get(size);
                        11T.A0A(anonymousClass624);
                        if (anonymousClass624 instanceof AnonymousClass622) {
                            i2--;
                        } else {
                            if (anonymousClass624 instanceof C89p) {
                                C89p c89p = (C89p) anonymousClass624;
                                if (!c89p.A01) {
                                    c7aB = c89p.A00;
                                    i2 -= c7aB.A00.size();
                                }
                            }
                            if (anonymousClass624 instanceof Fjy) {
                                Fjy fjy = (Fjy) anonymousClass624;
                                if (!fjy.A03) {
                                    c7aB = fjy.A02;
                                    i2 -= c7aB.A00.size();
                                }
                            }
                        }
                        if (i2 <= 0) {
                            break;
                        } else {
                            size--;
                        }
                    } else if (i2 > 0) {
                        i = -i2;
                        if (i == ((-1) << (-1))) {
                            return;
                        }
                        if (i < 0) {
                            if (r0.A07) {
                                return;
                            }
                            c6f9.BYi((-i) + 5);
                            r0.A07 = true;
                            6Mz.A02(r0);
                            return;
                        }
                    }
                }
                i = 0;
            }
        }
        A01(r304, i);
        r0.A07 = false;
        6Mz.A01(r0);
    }
}
