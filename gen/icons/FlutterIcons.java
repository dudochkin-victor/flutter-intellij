package icons;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.util.IconLoader;

import javax.swing.*;

public class FlutterIcons {
  private static Icon load(String path) {
    return IconLoader.getIcon(path, FlutterIcons.class);
  }

  public static final Icon Flutter_13 = load("/icons/flutter_13.png");
  public static final Icon Flutter_13_2x = load("/icons/flutter_13@2x.png");
  public static final Icon Flutter = load("/icons/flutter.png");
  public static final Icon Flutter_64 = load("/icons/Flutter-Mark-square-64.png");
  public static final Icon Flutter_2x = load("/icons/flutter@2x.png");
  public static final Icon Flutter_inspect = load("/icons/flutter_inspect.png");
  public static final Icon Flutter_test = load("/icons/flutter_test.png");

  public static final Icon Phone = load("/icons/phone.png");

  public static final Icon OpenObservatory = load("/icons/observatory.png");
  public static final Icon OpenTimelineDashboard = AllIcons.Nodes.DataSchema;
  public static final Icon OpenMemoryDashboard = AllIcons.Nodes.DataView;

  public static final Icon HotReload = load("/icons/hot-reload.png");
  public static final Icon FullRestart = AllIcons.Actions.Restart;

  public static final Icon HotReloadRun = load("/icons/reload_run.png");
  public static final Icon HotReloadDebug = load("/icons/reload_debug.png");

  public static final Icon BazelRun = load("/icons/bazel_run.png");

  public static final Icon CustomClass = load("/icons/custom/class.png");
  public static final Icon CustomClassAbstract = load("/icons/custom/class_abstract.png");
  public static final Icon CustomFields = load("/icons/custom/fields.png");
  public static final Icon CustomInterface = load("/icons/custom/interface.png");
  public static final Icon CustomMethod = load("/icons/custom/method.png");
  public static final Icon CustomMethodAbstract = load("/icons/custom/method_abstract.png");
  public static final Icon CustomProperty = load("/icons/custom/property.png");

  public static final Icon AndroidStudioNewModule = load("/icons/template_new_project.png");
  public static final Icon AndroidStudioNewPackage = load("/icons/template_new_package.png");
  public static final Icon AndroidStudioNewPlugin = load("/icons/template_new_plugin.png");
}
