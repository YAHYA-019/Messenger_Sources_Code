package X;

import android.animation.Animator;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;

/* renamed from: X.0K7, reason: invalid class name */
/* loaded from: 0K7.class */
public final class C0K7 implements Animator.AnimatorListener {
    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        Animator.AnimatorPauseListener animatorPauseListener;
        try {
            ReadWriteLock readWriteLock = 0KA.A01;
            readWriteLock.readLock().lock();
            List list = 0KA.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((0M0) list.get(i)).A8D(animator);
            }
            readWriteLock.readLock().unlock();
            animator.removeListener(0K6.A00);
            animatorPauseListener = C0K8.A00;
            animator.removePauseListener(animatorPauseListener);
        } catch (Throwable th) {
            AnonymousClass001.A1K(0KA.A01);
            throw th;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }
}
