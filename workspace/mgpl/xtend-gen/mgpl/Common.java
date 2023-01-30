package mgpl;

import com.google.common.base.Objects;
import java.util.Collections;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class Common {
  /**
   * ##### Vorgegebene statische Funktionen, bei Bedarf verwenden.
   */
  public static String capitalize(final String it) {
    String _xblockexpression = null;
    {
      boolean _equals = Objects.equal(it, null);
      if (_equals) {
        return null;
      }
      String _xifexpression = null;
      int _length = it.length();
      boolean _equals_1 = (_length == 0);
      if (_equals_1) {
        _xifexpression = it;
      } else {
        String _upperCase = it.substring(0, 1).toUpperCase();
        String _substring = it.substring(1);
        _xifexpression = (_upperCase + _substring);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public static String uncapitalize(final String it) {
    String _xblockexpression = null;
    {
      boolean _equals = Objects.equal(it, null);
      if (_equals) {
        return null;
      }
      String _xifexpression = null;
      int _length = it.length();
      boolean _equals_1 = (_length == 0);
      if (_equals_1) {
        _xifexpression = it;
      } else {
        String _lowerCase = it.substring(0, 1).toLowerCase();
        String _substring = it.substring(1);
        _xifexpression = (_lowerCase + _substring);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public static String longAttributeName(final String name) {
    String _switchResult = null;
    if (name != null) {
      switch (name) {
        case "h":
          _switchResult = "height";
          break;
        case "r":
          _switchResult = "radius";
          break;
        case "w":
          _switchResult = "width";
          break;
        default:
          _switchResult = name;
          break;
      }
    } else {
      _switchResult = name;
    }
    return _switchResult;
  }

  public static String shortAttributeName(final String name) {
    String _xifexpression = null;
    boolean _contains = Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList("height", "radius", "width")).contains(name);
    if (_contains) {
      _xifexpression = name.substring(0, 1);
    } else {
      _xifexpression = name;
    }
    return _xifexpression;
  }
}
