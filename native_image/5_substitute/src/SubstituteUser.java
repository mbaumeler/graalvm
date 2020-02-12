import com.oracle.svm.core.annotate.TargetClass;
import com.oracle.svm.core.annotate.Substitute;


@TargetClass(User.class)
final class SubstituteUser {

   @Substitute
   public String getName() {
       return "Response from SubstituteUser";
   }

}
