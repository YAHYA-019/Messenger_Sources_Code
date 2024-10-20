package X;

import com.facebook.graphservice.interfaces.Tree;
import com.facebook.graphservice.tree.TreeJNI;
import com.google.common.base.Preconditions;

/* loaded from: F1h.class */
public abstract class F1h {
    public static TreeJNI A00(Tree tree, Class cls, int i) {
        if (tree == null) {
            return null;
        }
        Preconditions.checkArgument(tree.isValidGraphServicesJNIModel(), "Failed to convert model because this model is not a valid GraphServices model. Legacy non-GraphServices models are dangerous and should not be used. Please convert this model to a GraphServices model before calling this API by following steps in https://fburl.com/invalidgraphservicesmodel");
        TreeJNI treeJNI = (TreeJNI) tree;
        return (cls.isInstance(tree) && tree.getTypeTag() == i) ? treeJNI : treeJNI.reinterpret(cls, i);
    }

    public static TreeJNI A01(Tree tree, Class cls, int i) {
        if (tree == null) {
            return null;
        }
        Preconditions.checkArgument(tree.isValidGraphServicesJNIModel(), "Failed to convert model because this model is not a valid GraphServices model. Legacy non-GraphServices models are dangerous and should not be used. Please convert this model to a GraphServices model before calling this API by following steps in https://fburl.com/invalidgraphservicesmodel");
        return A00(tree, cls, i);
    }
}
