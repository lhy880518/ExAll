package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class reflectionTest {
    public static void main(String[] args) {
        DemoClass dc = new DemoClass();

        reflectionTest dt = new reflectionTest();
        dt.getClassInfos(dc);
    }

    public void getClassInfos(Object clazz){
        Class demoClass = clazz.getClass();
        getClassInfo(demoClass);
        getFieldInfo(demoClass);
        getMethodInfo(demoClass);
    }
    public void getClassInfo(Class demoClass){
        String className = demoClass.getName();
        System.out.format("Class Name: %s\n",className);
        String classCanonicalName = demoClass.getCanonicalName();
        System.out.format("Class Canonical Name: %s\n",classCanonicalName);
        String classSimpleName = demoClass.getSimpleName();
        System.out.format("Class classSimple Name: %s\n",classSimpleName);
        String packageName = demoClass.getPackage().getName();
        System.out.format("Class package Name: %s\n",packageName);
        String toString = demoClass.toString();
        System.out.format("Class toString: %s\n",toString);
    }
    public void getFieldInfo(Class demoClass){
        System.out.println("---------------------------");
        Field[] field1 = demoClass.getDeclaredFields();
        Field[] field2 = demoClass.getFields();
        System.out.format("Declared Fields : %d, Fields: %d\n",field1.length, field2.length);

        for(Field field : field1){
            String fieldName = field.getName();
            int modifier = field.getModifiers();
            String modifierStr = Modifier.toString(modifier);
            String type = field.getType().getSimpleName();
            System.out.format("%s %s %s\n",modifierStr,type,fieldName);
        }
    }
    public void getMethodInfo(Class demoClass){
        System.out.println("---------------------------");
        Method[] method1 = demoClass.getDeclaredMethods();
        Method[] method2 = demoClass.getMethods();
        System.out.format("Declared methods : %d, Methods: %d\n",method1.length, method2.length);
        for(Method met1 : method1){
            // method name info
            String methodName = met1.getName();
            // method modifier info
            int modifier = met1.getModifiers();
            String modifierStr = Modifier.toString(modifier);
            // method return type info
            String returnType = met1.getReturnType().getSimpleName();
            // method parameter info
            Class params[] = met1.getParameterTypes();
            StringBuilder paramStr = new StringBuilder();
            int paramLen = params.length;
            if(paramLen != 0){
                paramStr.append(params[0].getSimpleName()).append(" arg");
                for(int loop = 1; loop < paramLen ; loop++){
                    paramStr.append(",").append(params[loop].getName()).append(" arg").append(loop);
                }
            }
            // method exception info
            Class exceptions[] = met1.getExceptionTypes();
            StringBuilder exceptionStr = new StringBuilder();
            int exceptionLen = exceptions.length;
            if(exceptionLen != 0){
                exceptionStr.append("throws").append(exceptions[0].getSimpleName());
                for(int loop = 1; loop < exceptionLen; loop++){
                    exceptionStr.append(",").append(exceptions[loop].getSimpleName());
                }
            }
            System.out.format("%s %s %s(%s) %s\n",modifierStr, returnType, methodName, paramStr, exceptionStr);
        }
    }
}
