package X;

import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.tree.TreeBuilderJNI;

/* loaded from: Dkv.class */
public final class Dkv extends 2JY implements C23u {
    public Dkv(int i, int[] iArr) {
        super(i, iArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Dkv A00(Dkv dkv) {
        TreeBuilderJNI treeBuilderJNI;
        Tree result;
        if (dkv == 0) {
            return null;
        }
        if (dkv.isValidGraphServicesJNIModel()) {
            result = dkv.reinterpret(Dkv.class, -685673103);
        } else {
            if (!(dkv instanceof Tree) || !((Tree) dkv).isValidGraphServicesJNIModel() || (treeBuilderJNI = (TreeBuilderJNI) 2tS.A00().newTreeBuilder("MessengerPayTheme", 6As.class, -685673103, (Tree) dkv)) == null) {
                return null;
            }
            result = treeBuilderJNI.getResult(Dkv.class, -685673103);
        }
        return (Dkv) result;
    }
}
