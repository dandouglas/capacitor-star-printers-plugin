package com.dandouglas.capacitorstarprintersplugin;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "StarPrinters")
public class StarPrintersPlugin extends Plugin {

  private StarPrinters implementation = new StarPrinters();

  @PluginMethod
  public void echo(PluginCall call) {
    String value = call.getString("value");

    JSObject ret = new JSObject();
    ret.put("value", implementation.echo(value));
    call.resolve(ret);
  }

  @PluginMethod
    public void test(PluginCall call) {
      JSObject ret = new JSObject();
      ret.put("It works", implementation.echo("It works"));
      call.resolve(ret);
    }
}
