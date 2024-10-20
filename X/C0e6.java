package X;

import com.facebook.fury.context.StackExt;
import java.util.Arrays;

/* renamed from: X.0e6, reason: invalid class name */
/* loaded from: 0e6.class */
public final class C0e6 implements StackExt {
    public Object[] A01 = new Object[8];
    public int A00 = 0;

    @Override // com.facebook.fury.context.StackExt
    public int currentCapacity() {
        return this.A01.length;
    }

    @Override // com.facebook.fury.context.StackExt
    public boolean isEmpty() {
        return AnonymousClass001.A1O(this.A00);
    }

    @Override // com.facebook.fury.context.StackExt
    public Object peek() {
        if (isEmpty()) {
            throw AnonymousClass001.A10();
        }
        return this.A01[this.A00 - 1];
    }

    @Override // com.facebook.fury.context.StackExt
    public Object pop() {
        if (isEmpty()) {
            throw AnonymousClass001.A10();
        }
        Object[] objArr = this.A01;
        int i = this.A00 - 1;
        Object obj = objArr[i];
        objArr[i] = null;
        this.A00 = i;
        return obj;
    }

    @Override // com.facebook.fury.context.StackExt
    public void push(Object obj) {
        Object[] objArr = this.A01;
        int length = objArr.length;
        int i = this.A00;
        if (i >= length) {
            int i2 = length >> 1;
            if (length < 64) {
                i2 = length;
            }
            int i3 = length + i2;
            if (i3 < 0) {
                throw AnonymousClass001.A0N(0Pz.A0d("Stack reached max capacity of ", "!", i));
            }
            objArr = Arrays.copyOf(objArr, i3);
            this.A01 = objArr;
        }
        int i4 = this.A00;
        this.A00 = i4 + 1;
        objArr[i4] = obj;
    }

    @Override // com.facebook.fury.context.StackExt
    public int size() {
        return this.A00;
    }
}
