import org.graalvm.nativeimage.hosted.Feature;
import org.graalvm.nativeimage.hosted.RuntimeReflection;
import com.oracle.svm.core.annotate.AutomaticFeature;

@AutomaticFeature
public class UserFeature implements Feature {

    public void beforeAnalysis(BeforeAnalysisAccess access) {
        RuntimeReflection.register(User.class);
        RuntimeReflection.register(User.class.getDeclaredMethods());
        RuntimeReflection.register(User.class.getMethods());
    }

}
