package X;

import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;

/* renamed from: X.Jge, reason: case insensitive filesystem */
/* loaded from: Jge.class */
public final class C3016Jge extends AbstractSavedStateViewModelFactory {
    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        11T.A0F(savedStateHandle, 2);
        return new C3024Jgn(savedStateHandle);
    }
}
