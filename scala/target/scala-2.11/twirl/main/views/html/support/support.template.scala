
package views.html.support

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object support extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Int,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(contentType: String, sep:Int, content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.47*/("""
"""),format.raw/*2.1*/("""<div class="backgroundFiller"></div>
<div id="faqMain" class="subPageMain siteCentered">
	<div class="heading">
		<h1>Support center</h1>
		<div class="subHeader">How can we help?</div>
		<div class="monster"></div>
		<div class="headerMiniSignup"></div>
	</div>
	<div class="content styled">
		<div class="categoriesWrapper">
			<div class="categories">
				<div category="general" class="category selected">
					<div class="categorySeperator"></div>
					<div class="categoryName">General</div>
				</div>
				<div category="installation" class="category">
					<div class="categorySeperator"></div>
					<div class="categoryName">Installation</div>
					<div class="subCategories">
						<div category="linux" class="subCategory">Linux</div>
						<div category="windows" class="subCategory">Windows</div>
						<div category="osx" class="subCategory">Mac OS X</div>
						<div category="advanced" class="subCategory">Advanced</div>
						<div category="secretkey" class="subCategory">Secret Key</div>
						<div category="uninstalling" class="subCategory">Uninstalling</div>
					</div>
				</div>
				<div category="connecting" class="category">
					<div class="categorySeperator"></div>
					<div class="categoryName">Connecting Takipi</div>
					<div class="subCategories">
						<div category="tomcat" class="subCategory">Tomcat</div>
						<div category="glassfish" class="subCategory">Glassfish</div>
						<div category="jboss" class="subCategory">JBoss</div>
						<div category="play" class="subCategory">Play Framework</div>
						<div category="eclipse" class="subCategory">Eclipse</div>
						<div category="intellij" class="subCategory">IntelliJ</div>
						<div category="netbeans" class="subCategory">NetBeans</div>
						<div category="scala" class="subCategory">Scala</div>
						<div category="java" class="subCategory">Standalone Java</div>
					</div>
				</div>
				<div category="interface" class="category">
					<div class="categorySeperator"></div>
					<div class="categoryName">User interface and settings</div>
				</div>
				<div category="troubleshooting" class="category">
					<div class="categorySeperator"></div>
					<div class="categoryName">Troubleshooting</div>
					<div class="subCategories">
						<div category="dialog" class="subCategory">Installation Dialog</div>
					</div>
				</div>
				<div category="anything" class="category">
					<div class="categorySeperator"></div>
					<div class="categoryName">Anything else?</div>
				</div>
				<div class="categorySeperator"></div>
			</div>
			<div class="categoryIndicator">
				<div class="arrow"></div>
			</div>
		</div>
		<div class="questionsWrapper">
			<ul category="general" class="qna selected">
				<li>
					<div class="title">How Takipi works</div>
					<div class="line">
						Takipi installs a daemon process and a JVM <a href="http://www.takipiblog.com/2014/01/07/double-agent-java-vs-native-agents/" class="link" target="_blank">agent library</a> on your servers. These two components work in tandem to log and send data to Takipi's analysis servers. Together they detect events (such as exceptions or logged errors) happening within your app and automatically create the code needed to log and collect the data you'll need to debug these errors in production.
					</div>
				</li>
				<li>
					<div class="title">Compatibility</div>
					<div class="subTitle">Supported Operating systems</div>
					<div class="line">- All major Linux distributions.</div>
					<div class="line">- Windows 7, 8 and Windows Server.</div>
					<div class="line">- Mac OS X.</div>
				</li>
				<li>
					<div class="subTitle">Supported JVMs and languages</div>
					<div class="line">Takipi supports all JVM based languages including Java, Scala, Clojure, Groovy, JRuby, Jython, ...</div>
					<div class="line">Takipi requires a 64bit Oracle / OpenJDK JRE version 6, 7 or 8 (32bit JVMs are not supported).</div>
				</li>
			</ul>
			<ul category="installation" class="qna">
				<li>
					<div class="title">Installation</div>
					<div class="line">Installing Takipi is simple. Here are the 3 steps you need to follow:</div>
					<ul class="internal decimal">
						<li>
							<div class="line"><a href="https://app.takipi.com/account.html" class="link" target="_blank"><b>Create your account.</b></a></div>
						</li>
						<li>
							<div class="line"><b>Install Takipi</b> using one of the available installers:</div>
							<ul class="internal square">
								<li><a href="javascript: void(0)" class="installer link main" installer="linux">Linux:</a> <a href="javascript: void(0)" class="installer link" installer="linux" type="wget">Wget</a> / <a href="javascript: void(0)" class="installer link" installer="linux" type="curl">cURL</a> <a href="javascript: void(0)" class="installer" installer="linux" type="movie"></a></li>
								<li><a href="javascript: void(0)" class="installer link main" installer="windows">Windows</a> <a href="javascript: void(0)" class="installer" installer="windows" type="movie"></a></li>
								<li><a href="javascript: void(0)" class="installer link main" installer="osx">Mac OS X</a> <a href="javascript: void(0)" class="installer" installer="osx" type="movie"></a></li>
								<li><a href="javascript: void(0)" class="installer link main" installer="advanced">Advanced:</a> <a href="javascript: void(0)" class="installer link" installer="advanced" sub="apt-get">apt-get</a> / <a href="javascript: void(0)" class="installer link" installer="advanced" type="yum">yum</a> / <a href="javascript: void(0)" class="installer link" installer="advanced" type="chef">Chef</a></li>
							</ul>
							<div class="line"><b>Note</b>: root / admin permissions are required to install Takipi on a target machine.</div>
						</li>
						<li>
							<div class="line"><a href="javascript: void(0)" class="link connecting"><b>Connect Takipi</b> to your JVMs</a></div>
						</li>
						<li>
							<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
							<div class="testConnection"></div>
							<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
							<div class="line">Click "next" and you're done.</div>
						</li>
						<li>
							<div class="line"><b>Throw an exception</b>.</div>
						</li>
						<li>
							<div class="line">The exception will appear in your Takipi dashboard. <a href="//www.youtube.com/watch?v="""),_display_(/*117.114*/globals/*117.121*/.DEMO_VIDEO),format.raw/*117.132*/("""" class="link" target="_blank">Click here to learn more</a>.</div>
						</li>
					</ul>
				</li>
			</ul>
			<ul category="linux" class="qna">
				<li>
					<div class="title">Linux</div>
					<iframe id="nixYTPlayer" class="youtube-player" type="text/html" width="640" height="385" src="//www.youtube.com/embed/JM3ujOhTWl8?enablejsapi=1&origin="""),_display_(/*125.159*/globals/*125.166*/.SITE_ORIGIN),format.raw/*125.178*/("""" allowfullscreen frameborder="0"></iframe>
					<ul class="internal decimal">
						<li>
							<div class="line">To install Takipi on a Linux machine run this one-liner</div>
							<div class="line">This bash shell command downloads the Takipi bundle and runs the installation script. Replace &lt;MyKey&gt; placeholder with your <a href="javascript: void(0)" class="link secretkey">installation key</a>.</div>
							<div class="subTitle" installer="wget" style="padding-top:10px;">With Wget</div>
							<div class="line code spaced">wget -O - -o /dev/null http://get.takipi.com | sudo bash /dev/stdin -i --sk=&lt;MyKey&gt; -d; source /opt/takipi/etc/takipi-auto-agent</div>
							<div class="subTitle" installer="curl">Or with cURL</div>
							<div class="line code">curl -s /dev/null http://get.takipi.com | sudo bash /dev/stdin -i --sk=&lt;MyKey&gt; -d; source /opt/takipi/etc/takipi-auto-agent</div>
						</li>
						<li>
							<div class="line">Connect the Takipi agent to your processes: add the following value to your JVM argument and restart your Java/Scala application:</div>
							<div class="line code">-agentlib:TakipiAgent</div>
							<div class="line"><a href="javascript: void(0)" class="link connecting">(Using an IDE? click here)</a></div>
							<div class="line"><b>Important</b>: -agentlib is a JVM argument and should be written <b>before</b> -jar / -cp arguments.</div>
						</li>
						<li>
							<div class="line"><b>Make sure Takipi is up and running</b> on your system: go to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a>.</div>
							<div class="line">If the installation was successful, a green "Monitoring" message will appear in the upper status panel:</div>
							<div class="installationMonitorImg"></div>
						</li>
					</ul>
				</li>
				<li>
					<div class="subTitle">Running behind a Proxy server?</div>
					<div class="line">If you're running behind a proxy server, you can enter its address by setting the optional MyProxyAddress value (e.g. 127.0.0.1).</div>
					<div class="line code">wget -e http_proxy=&lt;MyProxyAddress&gt; -e https_proxy=&lt;MyProxyAddress&gt; -O - -o /dev/null http://get.takipi.com | sudo bash /dev/stdin -i --sk=&lt;MyKey&gt; --https_proxy=&lt;MyProxyAddress&gt; -d; source /opt/takipi/etc/takipi-auto-agent</div>
					<div class="line code">curl -x &lt;MyProxyAddress&gt; -s /dev/null http://get.takipi.com | sudo bash /dev/stdin -i --sk=&lt;MyKey&gt; --https_proxy=&lt;MyProxyAddress&gt; -d; source /opt/takipi/etc/takipi-auto-agent</div>
					<div class="line">* Notice the address needs to be entered twice - once for the actual <b>cURL</b> command, and the second one for the installation script itself.</div>
				</li>
			</ul>
			<ul category="windows" class="qna">
				<li>
					<div class="title">Windows</div>
					<iframe id="winYTPlayer" class="youtube-player" type="text/html" width="640" height="385" src="//www.youtube.com/embed/dteASy2cDvQ?enablejsapi=1&origin="""),_display_(/*159.159*/globals/*159.166*/.SITE_ORIGIN),format.raw/*159.178*/("""" allowfullscreen frameborder="0"></iframe>
					<div class="line">To install Takipi on Windows 7+ or Windows Server 2008+:</div>
					<ul class="internal decimal">
						<li>
							<div class="line"><a href="https://app.takipi.com/app/download?t=exe" class="link" target="_blank">Download</a> and run the installer. Within the installer you'll need to enter your <a href="javascript: void(0)" class="link secretkey">installation key</a>.</div>
							<div class="line">You also have the option to enter the IP address of a proxy server if you are running behind one.</div>
							<div class="line"><b>Note</b>: Takipi for Windows requires 64-bit Windows and a 64-bit Java installation.</div>
						</li>
						<li>
							<div class="line"><a href="javascript: void(0)" class="link connecting">Connect Takipi to your JVM</a></div>
						</li>
						<li>
							<div class="line"><b>Make sure Takipi is up and running</b> on your system: go to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a>.</div>
							<div class="line">If the installation was successful, a green "Monitoring" message will appear in the upper status panel:</div>
							<div class="installationMonitorImg"></div>
						</li>
						<li>
							<div class="line">If you're getting a message saying: &quot;<b>Could not find agent library TakipiAgent on the library path</b>&quot;, please try to log off and back in to Windows.</div>
						</li>
					</ul>
				</li>
			</ul>
			<ul category="osx" class="qna">
				<li>
					<div class="title">Mac OS X</div>
					<iframe id="osxYTPlayer" class="youtube-player" type="text/html" width="640" height="385" src="//www.youtube.com/embed/4KEr-flIOYI?enablejsapi=1&origin="""),_display_(/*184.159*/globals/*184.166*/.SITE_ORIGIN),format.raw/*184.178*/("""" allowfullscreen frameborder="0"></iframe>
					<div class="line">To install Takipi on Mac OS X 10.7 and above:</div>
					<ul class="internal decimal">
						<li>
							<div class="line"><a href="https://app.takipi.com/app/download?t=dmg" class="link" target="_blank">Download</a> and run the Takipi.dmg installer. Within the installer you'll need to enter your <a href="javascript: void(0)" class="link secretkey">installation key</a>.</div>
							<div class="line">You also have the option to enter the IP address of a proxy server if you are running behind one.</div>
							<div class="line"><b>Note</b>: Takipi for OS X requires the Oracle / OpenJDK JRE to run. Apple's Java plug-in is not supported.</div>
						</li>
						<li>
							<div class="line"><a href="javascript: void(0)" class="link connecting">Connect Takipi to your JVM</a></div>
						</li>
						<li>
							<div class="line"><b>Make sure Takipi is up and running</b> on your system: go to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a>.</div>
							<div class="line">If the installation was successful, a green "Monitoring" message will appear in the upper status panel:</div>
							<div class="installationMonitorImg"></div>
						</li>
					</ul>
				</li>
			</ul>
			<ul category="advanced" class="qna">
				<li>
					<div class="title">Advanced</div>
				</li>
				<li>
					<div class="subTitle" installer="apt-get">Debian Software Package (Ubuntu/Debian)</div>
					<ul class="internal decimal">
						<li>
							<div class="line">Add Takipi to your deb repository</div>
							<div class="line code">sudo sh -c "echo 'deb [arch=amd64] http://takipi-deb-repo.s3.amazonaws.com takipi main' >> /etc/apt/sources.list.d/takipi.list"</div>
						</li>
						<li>
							<div class="line">Add Takipi's gpg public key</div>
							<div class="line code">wget -O - http://takipi-deb-repo.s3.amazonaws.com/hello@takipi.com.gpg.key | sudo apt-key add -</div>
						</li>
						<li>
							<div class="line">Update apt-get</div>
							<div class="line code">sudo apt-get update</div>
						</li>
						<li>
							<div class="line">Install takipi</div>
							<div class="line code">sudo apt-get install takipi</div>
						</li>
						<li>
							<div class="line">Enter your installation key as the &lt;MyKey&gt; argument</div>
							<div class="line code">sudo /opt/takipi/etc/takipi-setup-package &lt;MyKey&gt;</div>
						</li>
						<li>
							<div class="line">Add this JVM argument: <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span> to any Java processes you want to monitor and restart it.</div>
							<div class="line"><a href="javascript: void(0)" class="link connecting">Click here</a> to learn how.</div>
						</li>
					</ul>
				</li>
				<li>
					<div class="subTitle" installer="yum">RPM Package Manager (RedHat/Centos)</div>
					<ul class="internal decimal">
					<li>
						<div class="line">Write the following into a Takipi repo file named <span class="line code" style="padding-left: 0px">/etc/yum.repos.d/takipi.repo</span></div>
						<div class="line code">[takipi]<br/>
						name=Takipi Repository<br/>
						baseurl=https://s3.amazonaws.com/takipi-rpm-repo<br/>
						gpgcheck=0<br/>
						enabled=1</div>
					</li>
					<li>
						<div class="line">Add Takipi's gpg public key</div>
						<div class="line code">sudo rpm --import https://s3.amazonaws.com/takipi-rpm-repo/hello%40takipi.com.gpg.key</div>
					</li>
					<li>
						<div class="line">Install takipi</div>
						<div class="line code">sudo yum install takipi</div>
					</li>
					<li>
						<div class="line">Enter your installation key as the &lt;MyKey&gt; argument.</div>
						<div class="line code">sudo /opt/takipi/etc/takipi-setup-package &lt;MyKey&gt;</div>
					</li>
					<li>
						<div class="line">Add this JVM argument: <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span> to any Java processes you want to monitor and restart it.</div>
					</li>
					</ul>
				</li>
				<li>
					<div class="subTitle" installer="chef">Chef</div>
					<div class="line">Takipi's Chef cookbook is available at <a href="https://github.com/takipi-cookbooks/takipi" class="link" target="_blank">https://github.com/takipi-cookbooks/takipi</a></div>
					<div class="line">The cookbook contains two attributes you need to configure. The first is a name of your choice for the server, and the second is your installation key.</div>
					<div class="line code">default["takipi"]["server_name"] = "YOUR SERVER NAME HERE"</div>
					<div class="line code">default["takipi"]["secret_key"] = "YOUR SECRET KEY HERE"</div>
				</li>
				<li>
					<div class="line">Add this JVM argument: <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span> to any Java processes you want to monitor and restart it.</div>
				</li>
				<li>
					<div class="line"><b>Make sure Takipi is up and running</b> on your system: go to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a>.</div>
					<div class="line">If the installation was successful, a green "Monitoring" message will appear in the upper status panel:</div>
					<div class="installationMonitorImg"></div>
				</li>
				<li>
					<div class="line">* Would you like to see another installer added? <a class="link" href=""""),_display_(/*280.96*/globals/*280.103*/.HELLO_MAILTO),format.raw/*280.116*/("""">Let us know</a>.</div>
				</li>
			</ul>
			<ul category="secretkey" class="qna">
				<li>
					<div class="title">Secret Key</div>
					<div class="line">When signing up for Takipi you are issued an installation key. The key will be shown in the installers dialog, which is displayed after you create your account, and will also be emailed to you.</div>
				</li>
				<li>
					<div class="line">Keep this key handy. You will need it for the installation, and will also be asked to enter it after logging out of Takipi, or when trying to login to Takipi from different machines (e.g mobile devices).</div>
				</li>
				<li>
					<div class="line"><a href=""""),_display_(/*292.34*/routes/*292.40*/.BlueSite.security),format.raw/*292.58*/("""" class="link" target="_blank">The key is private</a> and should only be shared with other members of your team whom you'd like to give access to the data Takipi collects.</div>
				</li>
				<li>
					<div class="subTitle">Locating your secret key</div>
					<div class="line">Forgot/lost your secret key? For security reasons, Takipi does not store your key. However, you can still locate it. <a href="javascript: void(0)" class="faqlink link" topic="secretkey">Click here to see how</a>.</div>
				</li>
				<li>
					<div class="subTitle">Generating a new key</div>
					<div class="line">If you've lost your secret key, or want to work with several keys, you can generate a key in one of two ways:</div>
					<ul class="internal">
						<li>- Use the Settings dialog within app.takipi.com (available in the top right corner of the screen) and select "Generate new key". Your new key will also be emailed to you.</li>
						<li>- You can also generate your key privately using the Key generator utility <a href="https://github.com/takipi/keygen" class="link" target="_blank">available here</a>.</li>
					</ul>
				</li>
				<li>
					<div class="line">Once you've generated the new key you will need to install it on the target machines using any one of the available <a href="javascript: void(0)" class="installers link">installers</a>.</div>
				</li>
			</ul>
			<ul category="uninstalling" class="qna">
				<li>
					<div class="title">Uninstalling</div>
					<div class="subTitle">Linux</div>
					<div class="line">To uninstall run the following command from your shell -</div> 
					<div class="line code">sudo /opt/takipi/etc/uninstall</div>
				</li>
				<li>
					<div class="subTitle">Windows</div>
					<div class="line">To uninstall go to Add / Remove Programs in the Windows control panel and remove Takipi.</div>
				</li>
				<li>
					<div class="subTitle">Mac OS X</div>
					<div class="line">To uninstall run the following command from your terminal -</div> 
					<div class="line code">sudo /Library/Takipi/etc/uninstall.sh</div>
				</li>
			</ul>
			<ul category="connecting" class="qna connecting">
				<li>
					<div class="title">Connecting Takipi to your application</div>
					<div class="line">After you install Takipi on your machine, all that's left to do is to connect it to your application.</div>
					<div class="line">To do this, simply add the following value to your JVM startup arguments:</div>
					<div class="code line">-agentlib:TakipiAgent</div>
					<div class="line"><b>Important</b>: -agentlib is a JVM argument and should be written <b>before</b> -jar / -cp arguments. For example:</div>
					<div class="code line">java -Xmx2G <b>-agentlib:TakipiAgent</b> -jar myapp.jar start</div>
				</li>
				<li>
					<div clas="line">Here are instructions on how to do this for the following launch configurations:</div>
					<div clas="line">&nbsp;</div>
					<ul class="square internal">
						<li><a href="javascript: void(0)" class="sub link main" sub="tomcat">Tomcat</a></li>
						<li><a href="javascript: void(0)" class="sub link main" sub="glassfish">Glassfish</a></li>
						<li><a href="javascript: void(0)" class="sub link main" sub="jboss">JBoss</a></li>
						<li><a href="javascript: void(0)" class="sub link main" sub="play">Play Framework</a></li>
						<li><a href="javascript: void(0)" class="sub link main" sub="eclipse">Eclipse</a></li>
						<li><a href="javascript: void(0)" class="sub link main" sub="intellij">IntelliJ IDEA</a></li>
						<li><a href="javascript: void(0)" class="sub link main" sub="netbeans">NetBeans</a></li>
						<li><a href="javascript: void(0)" class="sub link main" sub="scala">Scala</a></li>
						<li><a href="javascript: void(0)" class="sub link main" sub="java">Standalone Java</a></li>
					</ul>
				</li>
			</ul>
			<ul category="tomcat" cat-type="connect" class="qna">
				<li>
					<div class="title">Tomcat</div>
					<div class="line">After you install Takipi on your machine, you'll need to connect it to your Tomcat server.</div>
					<div class="line">Please choose the Tomcat launch configuration you’re using:</div>
					<ul class="internal square">
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="tomcat" type="eclipse">Eclipse plugin</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Open <b>Debug Configurations</b>.</li>
									<li>Select Apache Tomcat -&gt; &lt;Your Tomcat configuration&gt;.</li>
									<li>Switch to the <b>Arguments</b> tab.</li>
									<li>
										<div class="line">In the <b>VM arguments</b> add <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></div>
										<img src="assets/images/172_attachTomcatEclipse.png" style="width:100%" />
									</li>
									<li>Click <b>Apply</b>.</li>
									<li><b>Start</b> Tomcat.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="tomcat" type="intellij">IntelliJ plugin</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Edit Tomcat Run/Debug configurations.</li>
									<li>
										<div class="line">In the <b>VM options</b> box add: <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></div>
										<div class="line"><img src="assets/images/171_attachServerIntellij.png" /></div>
										<div class="line"><img src="assets/images/165_attachTomcatIntellij.png" style="width:100%" /></div>
									</li>
									<li>Click <b>OK</b>.</li>
									<li><b>Start</b> Tomcat.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="tomcat" type="netbeans">NetBeans plugin</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Enter Services window (Window | Services).</li>
									<li>Expand <b>Servers</b>.</li>
									<li>Right click on Apache Tomcat server.</li>
									<li>Select <b>Properties</b>.</li>
									<li>Switch to the <b>Platform</b> tab.</li>
									<li>
										<div class="line">Add to the <b>VM options</b> box: <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span>.</div>
										<img src="assets/images/160_attachTomcatNetBeans.png" />
									</li>
									<li><b>Start</b> Tomcat.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="tomcat" type="manual">Config files</a>
							<div class="connectingInstructions">
								<div class="subTitle">Linux / Mac OS X:</div>
								<ul class="internal decimal padded">
									<li>Locate the <b>catalina.sh</b> file you use to run Tomcat.</li>
									<li>Create <b>setenv.sh</b> in the same folder if it doesn’t already exist.</li>
									<li>
										<div class="line">Add the following line to the end of <b>setenv.sh</b>:</div>
										<div class="code line">
											CATALINA_OPTS="$CATALINA_OPTS -agentlib:TakipiAgent"
										</div>
									</li>
									<li><b>Restart</b> Tomcat.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
								<div class="subTitle">Windows:</div>
								<ul class="internal decimal">
									<li>Locate the <b>catalina.bat</b> file you use to run Tomcat.</li>
									<li>Create <b>setenv.bat</b> in the same folder if it doesn’t already exist.</li>
									<li>
										<div class="line">Add the following line to the end of <b>setenv.bat</b>:</div>
										<div class="code line">
											set CATALINA_OPTS=%CATALINA_OPTS% -agentlib:TakipiAgent
										</div>
									</li>
									<li><b>Restart</b> Tomcat.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="tomcat" type="service">Windows Service</a>
							<div class="connectingInstructions">
								<div class="line">Apache Tomcat has a configuration application which allows specifying JVM arguments for the server when running as a service. To install the Takipi agent on Tomcat (Windows):</div>
								<ul class="internal decimal padded">
									<li>Click Start &gt; All programs &gt; Apache Tomcat (version) &gt; Configure Tomcat.</li>
									<li>Switch to the <b>Java</b> tab.</li>
									<li>
										<div class="line">In the <b>Java Options</b> box add: <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span>.</div>
										<img src="assets/images/173_attachTomcatService.png" />
									</li>
									<li>Select <b>Apply</b>.</li>
									<li><b>Restart</b> your machine.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
					</ul>
				</li>
			</ul>
			<ul category="glassfish" cat-type="connect" class="qna">
				<li>
					<div class="title">Glassfish</div>
					<div class="line">After you install Takipi on your machine, you'll need to connect it to your Glassfish server.</div>
					<div class="line">Please choose the Glassfish launch configuration you’re using:</div>
					<ul class="internal square">
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="glassfish" type="netbeans">Admin Console / NetBeans plugin</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Open <b>Glassfish console</b> (<a href="http://localhost:4848" target="_blank">http://localhost:4848</a>).</li>
									<li>Expand Configurations &gt; server-config &gt; JVM settings.</li>
									<li>Switch to the <b>JVM Options</b> tab.</li>
									<li>
										<div class="line">Add a new <b>JVM option</b> with: <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></div>
										<div class="line"><img src="assets/images/162_attachGlassfishAdmin1.png" style="width:100%" /></div>
									</li>
									<li>Click <b>Save</b>.</li>
									<li><b>Restart</b> Glassfish.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="glassfish" type="eclipse">Eclipse plugin</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Open <b>Debug Configurations</b>.</li>
									<li>Select Glassfish Application Server  -&gt; &lt;Your Glassfish configuration&gt;.</li>
									<li>Switch to the <b>Arguments</b> tab.</li>
									<li>
										<div class="line">In the <b>VM arguments</b> box add <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></div>
										<img src="assets/images/161_attachGlassfishEclipse.png" style="width: 100%" />
									</li>
									<li>Click <b>Apply</b>.</li>
									<li><b>Start</b> Glassfish.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="glassfish" type="intellij">IntelliJ plugin</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Edit Glassfish Run/Debug configurations.</li>
									<li>
										<div class="line">In the <b>VM options</b> box add: <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></div>
										<div class="line"><img src="assets/images/171_attachServerIntellij.png" /></div>
										<div class="line"><img src="assets/images/167_attachGlassfishIntellij.png" style="width:100%" /></div>
									</li>
									<li>Click <b>OK</b>.</li>
									<li><b>Start</b> Glassfish.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="glassfish" type="manual">Config files</a>
							<div class="connectingInstructions">
								<ul class="internal decimal">
									<li>Locate <b>domain.xml</b> under """),format.raw/*583.45*/("""{"""),format.raw/*583.46*/("""glassfish dir"""),format.raw/*583.59*/("""}"""),format.raw/*583.60*/("""/domains/"""),format.raw/*583.69*/("""{"""),format.raw/*583.70*/("""domain"""),format.raw/*583.76*/("""}"""),format.raw/*583.77*/("""/config/ .</li>
									<li>Locate the <b>&lt;java-config&gt;</b> xml node.</li>
									<li>
										<div class="line">Under &lt;java-config&gt;, add the following <b>&lt;jvm-options&gt;</b> node:</div>
										<div class="line code">&lt;jvm-options&gt;-agentlib:TakipiAgent&lt;/jvm-options&gt;</div>
									</li>
									<li><b>Restart</b> Glassfish.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
					</ul>
				</li>
			</ul>
			<ul category="jboss" cat-type="connect" class="qna">
				<li>
					<div class="title">JBoss / Wildfly</div>
					<div class="line">After you install Takipi on your machine, you'll need to connect it to your JBoss server.</div>
					<div class="line">Please choose the JBoss launch configuration you’re using:</div>
					<ul class="internal square">
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="jboss" type="eclipse">Eclipse plugin</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Open the <b>Servers</b> window.</li>
									<li>Double-click <b>Wildfly (JBoss) server</b>.</li>
									<li>Click <b>Open launch configurations</b>.</li>
									<li>
										<div class="line">In the <b>VM arguments</b> box add <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></div>
										<div class="line"><img src="assets/images/168_attachJBossEclipse1.png" /></div>
										<div class="line"><img src="assets/images/169_attachJBossEclipse2.png" style="width:100%" /></div>
									</li>
									<li>Click <b>OK</b>.</li>
									<li><b>Start</b> JBoss.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="jboss" type="intellij">IntelliJ plugin</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Edit Wildfly Run/Debug configurations.</li>
									<li>
										<div class="line">In the <b>VM options</b> box add: <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></div>
										<div class="line"><img src="assets/images/171_attachServerIntellij.png" /></div>
										<div class="line"><img src="assets/images/166_attachJBossIntellij.png" style="width:100%" /></div>
									</li>
									<li>Click <b>OK</b>.</li>
									<li><b>Start</b> JBoss.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="jboss" type="netbeans">NetBeans plugin</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Enter <b>Services</b> window (Window | Services).</li>
									<li>Expand <b>Servers</b>.</li>
									<li>Right-click <b>Wildfly Application Server</b>.</li>
									<li>Select <b>Properties</b>.</li>
									<li>Switch to the <b>Platform</b> tab.</li>
									<li>
										<div class="line">Add to the <b>VM options</b> box: <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></div>
										<img src="assets/images/170_attachJBossNetBeans.png" />
									</li>
									<li>Click <b>close</b>.</li>
									<li><b>Start</b> JBoss.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="jboss" type="manual">Config files</a>
							<div class="connectingInstructions">
								<div class="subTitle">Linux / Mac OS X:</div>
								<ul class="internal decimal padded">
									<li>Locate the <b>standalone.conf</b> file under <b>"""),format.raw/*689.62*/("""{"""),format.raw/*689.63*/("""jboss dir"""),format.raw/*689.72*/("""}"""),format.raw/*689.73*/("""/bin</b>.</li>
									<li>
										<div class="line">Add the following line near the end of the file</div>
										<div class="code line">
											JAVA_OPTS="$JAVA_OPTS -agentlib:TakipiAgent"
										</div>
									</li>
									<li><b>Restart</b> JBoss.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
								<div class="subTitle">Windows:</div>
								<ul class="internal decimal">
									<li>Locate the <b>standalone.conf.bat</b> file under <b>"""),format.raw/*708.66*/("""{"""),format.raw/*708.67*/("""jboss dir"""),format.raw/*708.76*/("""}"""),format.raw/*708.77*/("""\bin</b>.</li>
									<li>
										<div class="line">Add the following line near the end of the file</div>
										<div class="code line">
											set JAVA_OPTS=%JAVA_OPTS% -agentlib:TakipiAgent
										</div>
									</li>
									<li><b>Restart</b> JBoss.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
					</ul>
				</li>
			</ul>
			<ul category="play" cat-type="connect" class="qna">
				<li>
					<div class="title">Play Framework</div>
					<ul class="internal square">
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="play" type="play22prod">Play 2.2+ - Production mode</a>
							<div class="connectingInstructions">
								<ul class="internal decimal">
									<li>
										<div class="line">Locate the run script of your play application.</div>
										<div class="line">It will generally be at <b>"""),format.raw/*740.56*/("""{"""),format.raw/*740.57*/("""app_folder"""),format.raw/*740.67*/("""}"""),format.raw/*740.68*/("""/bin/"""),format.raw/*740.73*/("""{"""),format.raw/*740.74*/("""app_name"""),format.raw/*740.82*/("""}"""),format.raw/*740.83*/("""</b></div>
									</li>
									<li>
										<div class="line">Locate the line: <span class="line code" style="padding-left:0px">declare -a java_args</span></div>
									</li>
									<li>
										<div class="line">Add the following immediately after it:</div>
										<div class="code line">java_args=( "$"""),format.raw/*747.48*/("""{"""),format.raw/*747.49*/("""java_args[@]"""),format.raw/*747.62*/("""}"""),format.raw/*747.63*/("""" "-agentlib:TakipiAgent" )</div>
									</li>
									<li><b>Restart</b> the app.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="play" type="play22dbgnix">Play 2.2+ - Debug mode (Linux / Max OS X)</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Locate <b>build</b> under <b>"""),format.raw/*765.43*/("""{"""),format.raw/*765.44*/("""play dir"""),format.raw/*765.52*/("""}"""),format.raw/*765.53*/("""/bin</b>.</li>
									<li>
										<div class="line">Add the following line just before the java execution line</div>
										<div class="code line">
											PLAY_OPTS="$PLAY_OPTS -agentlib:TakipiAgent"
										</div>
									</li>
									<li>Run play in debug mode - <span class="line code" style="padding-left:0px"><b>play run</b></span></li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li class="bordered">
							<a href="javascript: void(0)" class="scroll link main" sub="play" type="play22dbgwin">Play 2.2+ - Debug mode (Windows)</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Locate <b>build.bat</b> under <b>"""),format.raw/*788.47*/("""{"""),format.raw/*788.48*/("""play dir"""),format.raw/*788.56*/("""}"""),format.raw/*788.57*/("""\bin</b>.</li>
									<li>
										<div class="line">Add the following line just before the java execution line</div>
										<div class="code line">
											set PLAY_OPTS=%PLAY_OPTS% -agentlib:TakipiAgent
										</div>
									</li>
									<li>Run play in debug mode - <span class="line code" style="padding-left:0px"><b>play run</b></span></li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="play" type="play20dbgnix">Play 2.0+ - Debug mode (Linux / Max OS X)</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Locate <b>build</b> under <b>"""),format.raw/*811.43*/("""{"""),format.raw/*811.44*/("""play dir"""),format.raw/*811.52*/("""}"""),format.raw/*811.53*/("""/bin</b>.</li>
									<li>
										<div class="line">Add the following line just before the java execution line</div>
										<div class="code line">
											JAVA_OPTS="$JAVA_OPTS -agentlib:TakipiAgent"
										</div>
									</li>
									<li>Run play in debug mode - <span class="line code" style="padding-left:0px"><b>play run</b></span></li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="play" type="play20dbgwin">Play 2.0+ - Debug mode (Windows)</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Locate <b>build.bat</b> under <b>"""),format.raw/*834.47*/("""{"""),format.raw/*834.48*/("""play dir"""),format.raw/*834.56*/("""}"""),format.raw/*834.57*/("""\bin</b>.</li>
									<li>
										<div class="line">Add the following line just before the java execution line</div>
										<div class="code line">
											set JAVA_OPTS=%JAVA_OPTS% -agentlib:TakipiAgent
										</div>
									</li>
									<li>Run play in debug mode - <span class="line code" style="padding-left:0px"><b>play run</b></span></li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
					</ul>
				</li>
			</ul>
			<ul category="eclipse" cat-type="connect" class="qna">
				<li>
					<div class="title">Eclipse</div>
					<div class="line">Please choose the Debug configuration you’re using to launch your application</div>
					<ul class="square internal">
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="eclipse" type="app">Java Application</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Open <b>Debug Configuration</b>.</li>
									<li>Switch to the <b>Arguments</b> tab.</li>
									<li>
										<div class="line">In the <b>VM arguments</b> box add <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></div>
										<img src="assets/images/141_attachEclipse.png" />
									</li>
									<li>Click <b>Apply</b>.</li>
									<li><b>Start</b> the application you want Takipi to monitor.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="eclipse" type="tomcat">Tomcat plugin</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Open <b>Debug Configurations</b>.</li>
									<li>Select Apache Tomcat -&gt; &lt;Your Tomcat configuration&gt;.</li>
									<li>Switch to the <b>Arguments</b> tab.</li>
									<li>
										<div class="line">In the <b>VM arguments</b> box add <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></div>
										<img src="assets/images/172_attachTomcatEclipse.png" style="width: 100%"/>
									</li>
									<li>Click <b>Apply</b>.</li>
									<li><b>Start</b> Tomcat.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="eclipse" type="glassfish">Glassfish plugin</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Open <b>Debug Configurations</b>.</li>
									<li>Select Glassfish Application Server  -&gt; &lt;Your Glassfish configuration&gt;.</li>
									<li>Switch to the <b>Arguments</b> tab.</li>
									<li>
										<div class="line">In the <b>VM arguments</b> box add <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></div>
										<img src="assets/images/161_attachGlassfishEclipse.png" style="width: 100%" />
									</li>
									<li>Click <b>Apply</b>.</li>
									<li><b>Start</b> Glassfish.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="eclipse" type="jboss">JBoss plugin</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Open the <b>Servers</b> window.</li>
									<li>Double-click <b>Wildfly (JBoss) server</b>.</li>
									<li>Click <b>Open launch configurations</b>.</li>
									<li>
										<div class="line">In the <b>VM arguments</b> box add <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></div>
										<div class="line"><img src="assets/images/168_attachJBossEclipse1.png" /></div>
										<div class="line"><img src="assets/images/169_attachJBossEclipse2.png" style="width:100%" /></div>
									</li>
									<li>Click <b>OK</b>.</li>
									<li><b>Start</b> JBoss.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
					</ul>
				</li>
			</ul>
			<ul category="intellij" cat-type="connect" class="qna">
				<li>
					<div class="title">IntelliJ</div>
					<div class="line">Please choose the Debug configuration you’re using to launch your application</div>
					<ul class="square internal">
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="intellij" type="app">Java Application</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Open "Run | Edit Configurations".</li>
									<li>Locate your project's application configuration.</li>
									<li>
										<div class="line">In the <b>VM options</b> box add: <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></div>
										<img src="assets/images/143_attachIntellij.png" />
									</li>
									<li>Click <b>Apply</b>.</li>
									<li><b>Start</b> the application you want Takipi to monitor.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="intellij" type="tomcat">Tomcat plugin</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Edit Tomcat Run/Debug configurations.</li>
									<li>
										<div class="line">In the <b>VM options</b> box add: <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></div>
										<div class="line"><img src="assets/images/171_attachServerIntellij.png" /></div>
										<div class="line"><img src="assets/images/165_attachTomcatIntellij.png" style="width:100%" /></div>
									</li>
									<li>Click <b>OK</b>.</li>
									<li><b>Start</b> Tomcat.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="intellij" type="glassfish">Glassfish plugin</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Edit Glassfish Run/Debug configurations.</li>
									<li>
										<div class="line">In the <b>VM options</b> add: <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></div>
										<div class="line"><img src="assets/images/171_attachServerIntellij.png" /></div>
										<div class="line"><img src="assets/images/167_attachGlassfishIntellij.png" style="width:100%" /></div>
									</li>
									<li>Click <b>OK</b>.</li>
									<li><b>Start</b> Glassfish.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="intellij" type="jboss">JBoss plugin</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Edit Wildfly Run/Debug configurations.</li>
									<li>
										<div class="line">In the <b>VM options</b> add: <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></div>
										<div class="line"><img src="assets/images/171_attachServerIntellij.png" /></div>
										<div class="line"><img src="assets/images/166_attachJBossIntellij.png" style="width:100%" /></div>
									</li>
									<li>Click <b>OK</b>.</li>
									<li><b>Start</b> JBoss.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
					</ul>
				</li>
			</ul>
			<ul category="netbeans" cat-type="connect" class="qna">
				<li>
					<div class="title">NetBeans</div>
					<div class="line">Please choose the Debug configuration you’re using to launch your application</div>
					<ul class="square internal">
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="netbeans" type="app">Java Application</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Open the <b>File | Project Properties</b> dialog.</li>
									<li>Select <b>Run</b> in the tree pane on the left.</li>
									<li>
										<div class="line">Add to VM options: <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></div>
										<img src="assets/images/142_attachNetBeans.png" />
									</li>
									<li>Click <b>OK</b>.</li>
									<li><b>Start</b> the application you want Takipi to monitor.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="netbeans" type="tomcat">Tomcat plugin</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Enter Services window (Window | Services).</li>
									<li>Expand <b>Servers</b>.</li>
									<li>Right click on Apache Tomcat server.</li>
									<li>Select <b>Properties</b>.</li>
									<li>Select <b>Platform</b> tab.</li>
									<li>
										<div class="line">Add VM options: <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span>.</div>
										<img src="assets/images/160_attachTomcatNetBeans.png" />
									</li>
									<li>Click <b>close</b>.</li>
									<li><b>Start</b> Tomcat.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="netbeans" type="glassfish">Glassfish plugin</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Open <b>Glassfish console</b> (<a href="http://localhost:4848" target="_blank">http://localhost:4848</a>).</li>
									<li>Expand Configurations &gt; server-config &gt; JVM settings.</li>
									<li>Switch to the <b>JVM Options</b> tab.</li>
									<li>
										<div class="line">Add a new <b>JVM option</b> with: <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></div>
										<div class="line"><img src="assets/images/162_attachGlassfishAdmin1.png" style="width:100%" /></div>
									</li>
									<li>Click <b>Save</b>.</li>
									<li><b>Restart</b> Glassfish.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="netbeans" type="jboss">JBoss plugin</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Enter <b>Services</b> window (Window | Services).</li>
									<li>Expand <b>Servers</b>.</li>
									<li>Right-click <b>Wildfly Application Server</b>.</li>
									<li>Select <b>Properties</b>.</li>
									<li>Select <b>Platform</b> tab.</li>
									<li>
										<div class="line">Add to VM options: <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></div>
										<img src="assets/images/170_attachJBossNetBeans.png" />
									</li>
									<li>Click <b>close</b>.</li>
									<li><b>Start</b> JBoss.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
					</ul>
				</li>
			</ul>
			<ul category="scala" cat-type="connect" class="qna">
				<li>
					<div class="title">Scala</div>
					<ul class="internal square">
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="scala" type="sbt">SBT / Scala commands</a>
							<div class="connectingInstructions">
								<div class="line">You can add TakipiAgent's to your Scala application by passing a JVM argument to scala/sbt with a "-J" prefix:</div>
								<div class="code line">scala -J-agentlib:TakipiAgent</div>
								<div class="code line">sbt -J-agentlib:TakipiAgent</div>
								<div class="line">Or, you can add TakipiAgent's to your Scala application by setting JAVA_OPTS environment variable before starting Scala:</div>
								<div class="line">Linux / Mac OS X:</div>
								<div class="code line">
									export JAVA_OPTS="$JAVA_OPTS -agentlib:TakipiAgent"
								</div>
								<div class="line">Windows:</div>
								<div class="code line">
									set JAVA_OPTS=%JAVA_OPTS% -agentlib:TakipiAgent
								</div>
								<div class="line">Note: In some sbt versions the environment variable is SBT_OPTS and not JAVA_OPTS.</div>
							</div>
						</li>
						<li class="bordered">
							<a href="javascript: void(0)" class="scroll link main" sub="scala" type="maven">Maven</a>
							<div class="connectingInstructions">
								<div class="line">In the terminal / command line, add -agentlib:TakipiAgent to the MAVEN_OPTS environment variable:</div>
								<div class="line">Linux / Mac OS X:</div>
								<div class="code line">
									export MAVEN_OPTS="$MAVEN_OPTS -agentlib:TakipiAgent"
								</div>
								<div class="line">Windows:</div>
								<div class="code line">
									set MAVEN_OPTS=%MAVEN_OPTS% -agentlib:TakipiAgent
								</div>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="scala" type="play22prod">Play 2.2+ - Production mode</a>
							<div class="connectingInstructions">
								<ul class="internal decimal">
									<li>
										<div class="line">Locate the run script of your play application.</div>
										<div class="line">It will generally be at <b>"""),format.raw/*1209.56*/("""{"""),format.raw/*1209.57*/("""app_folder"""),format.raw/*1209.67*/("""}"""),format.raw/*1209.68*/("""/bin/"""),format.raw/*1209.73*/("""{"""),format.raw/*1209.74*/("""app_name"""),format.raw/*1209.82*/("""}"""),format.raw/*1209.83*/("""</b></div>
									</li>
									<li>
										<div class="line">Locate the line: <span class="line code" style="padding-left:0px">declare -a java_args</span></div>
									</li>
									<li>
										<div class="line">Add the following immediately after it:</div>
										<div class="code line">java_args=( "$"""),format.raw/*1216.48*/("""{"""),format.raw/*1216.49*/("""java_args[@]"""),format.raw/*1216.62*/("""}"""),format.raw/*1216.63*/("""" "-agentlib:TakipiAgent" )</div>
									</li>
									<li><b>Restart</b> the app.</li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="scala" type="play22dbgnix">Play 2.2+ - Debug mode (Linux / Max OS X)</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Locate <b>build</b> under <b>"""),format.raw/*1234.43*/("""{"""),format.raw/*1234.44*/("""play dir"""),format.raw/*1234.52*/("""}"""),format.raw/*1234.53*/("""/bin</b>.</li>
									<li>
										<div class="line">Add the following line just before the java execution line</div>
										<div class="code line">
											PLAY_OPTS="$PLAY_OPTS -agentlib:TakipiAgent"
										</div>
									</li>
									<li>Run play in debug mode - <span class="line code" style="padding-left:0px"><b>play run</b></span></li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li class="bordered">
							<a href="javascript: void(0)" class="scroll link main" sub="scala" type="play22dbgwin">Play 2.2+ - Debug mode (Windows)</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Locate <b>build.bat</b> under <b>"""),format.raw/*1257.47*/("""{"""),format.raw/*1257.48*/("""play dir"""),format.raw/*1257.56*/("""}"""),format.raw/*1257.57*/("""\bin</b>.</li>
									<li>
										<div class="line">Add the following line just before the java execution line</div>
										<div class="code line">
											set PLAY_OPTS=%PLAY_OPTS% -agentlib:TakipiAgent
										</div>
									</li>
									<li>Run play in debug mode - <span class="line code" style="padding-left:0px"><b>play run</b></span></li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="scala" type="play20dbgnix">Play 2.0+ - Debug mode (Linux / Max OS X)</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Locate <b>build</b> under <b>"""),format.raw/*1280.43*/("""{"""),format.raw/*1280.44*/("""play dir"""),format.raw/*1280.52*/("""}"""),format.raw/*1280.53*/("""/bin</b>.</li>
									<li>
										<div class="line">Add the following line just before the java execution line</div>
										<div class="code line">
											JAVA_OPTS="$JAVA_OPTS -agentlib:TakipiAgent"
										</div>
									</li>
									<li>Run play in debug mode - <span class="line code" style="padding-left:0px"><b>play run</b></span></li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
						<li>
							<a href="javascript: void(0)" class="scroll link main" sub="scala" type="play20dbgwin">Play 2.0+ - Debug mode (Windows)</a>
							<div class="connectingInstructions">
								<ul class="internal decimal padded">
									<li>Locate <b>build.bat</b> under <b>"""),format.raw/*1303.47*/("""{"""),format.raw/*1303.48*/("""play dir"""),format.raw/*1303.56*/("""}"""),format.raw/*1303.57*/("""\bin</b>.</li>
									<li>
										<div class="line">Add the following line just before the java execution line</div>
										<div class="code line">
											set JAVA_OPTS=%JAVA_OPTS% -agentlib:TakipiAgent
										</div>
									</li>
									<li>Run play in debug mode - <span class="line code" style="padding-left:0px"><b>play run</b></span></li>
									<li>
										<div class="line"><b>Test the installation</b> - head back to <a href="https://app.takipi.com" class="link" target="_blank">app.takipi.com</a> and <b>click "Test now"</b>.</div>
										<div class="testConnection"></div>
										<div class="line">If the connecting process was successful you should get a "monitoring" message next to your JVM.</div>
									</li>
									<li>
										<div class="line"><b>Throw an exception</b>, or make sure your application throws exceptions.</div>
									</li>
								</ul>
							</div>
						</li>
					</ul>
				</li>
			</ul>
			<ul category="java" cat-type="connect" class="qna">
				<li>
					<div class="title">Standalone Java</div>
					<div class="line">&nbsp;</div>
					<div class="subTitle">Connecting the Takipi agent</div>
					<div class="line">In order to connect Takipi to your application add the following argument to your JVM startup arguments:</div>
					<div class="code line">-agentlib:TakipiAgent</div>
					<div class="line"><b>Important</b>: -agentlib is a JVM argument and should be written <b>before</b> -jar / -cp arguments. For example:</div>
					<div class="code line">java -Xmx2G <b>-agentlib:TakipiAgent</b> -jar myapp.jar start</div>
				</li>
				<li>
					<div class="subTitle">Using Maven</div>
					<div class="line">In the terminal / command line, add -agentlib:TakipiAgent to the MAVEN_OPTS environment variable:</div>
					<div class="line">Linux / Mac OS X:</div>
					<div class="code line">
						export MAVEN_OPTS="$MAVEN_OPTS -agentlib:TakipiAgent"
					</div>
					<div class="line">Windows:</div>
					<div class="code line">
						set MAVEN_OPTS=%MAVEN_OPTS% -agentlib:TakipiAgent
					</div>
				</li>
			</ul>
			<ul category="other" class="qna">
				<li>
					<div class="title">Connecting the Takipi agent</div>
					<div class="line">In order to connect the Takipi agent add the following JVM argument:</div>
					<div class="code line">-agentlib:TakipiAgent</div>
					<div class="line"><b>Note</b>: -agentlib is a JVM argument and should be written before -jar / -cp arguments. For example:</div>
					<div class="code line">java -Xmx2G -agentlib:TakipiAgent -jar myapp.jar start</div>
				</li>
				<li>
					<div id="attachide" class="title" topic="attachide" installer="attachide">Connecting from an IDE</div>
					<div class="line">Takipi was built mainly for staging/production environments, but you can also test it out on your IDE.</div>
					<div class="line">Here's how you can add the <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span> JVM argument from your IDE:</div>
				</li>
				<li>
					<div class="subTitle">Eclipse</div>
					<ul class="internal decimal padded">
						<li>Open your project's <b>Debug Configuration</b></li>
						<li>Open <b>Arguments</b> tab</li>
						<li>In VM arguments add <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></li>
						<li>Click <b>Apply</b></li>
					</ul>
					<img src="assets/images/141_attachEclipse.png" />
				</li>
				<li>
					<div class="subTitle">IntelliJ IDEA</div>
					<ul class="internal decimal padded">
						<li>Open "Run | Edit Configurations"</li>
						<li>Locate your project's application configuration</li>
						<li>Add to VM options: <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></li>
						<li>Click <b>Apply</b></li>
					</ul>
					<img src="assets/images/143_attachIntellij.png" />
				</li>
				<li>
					<div class="subTitle">NetBeans</div>
					<ul class="internal decimal">
						<li>Open the <b>File | Project Properties</b> dialog</li>
						<li>Select <b>Run</b> in the tree pane on the left</li>
						<li>Add to VM options: <span class="line code" style="padding-left:0px">-agentlib:TakipiAgent</span></li>
						<li>Click <b>OK</b></li>
					</ul>
					<img src="assets/images/142_attachNetBeans.png" />
				</li>
			</ul>
			<ul category="interface" class="qna">
				<li>
					<div class="title">User interface and settings</div>
					<div class="subTitle">Which exceptions do you track?</div>
					<div class="a">
						Takipi tracks all exceptions thrown anywhere in your app and by any thread that passes through your code. This includes both checked and unchecked, caught and uncaught exceptions. You can configure which packages to debug using the 'Servers' dialog. We don't track StackOverflow and OutOfMemory errors yet.
					</div>
				</li>
				<li>
					<div class="subTitle">How does Takipi group exceptions in my code?</div>
					<div class="a">
						Takipi groups exceptions based on locations within your code who threw an exception or made a call into a Java or external library who in turn threw one. This means that if you have different locations in your code making calls into a Java or external API (usually in different app contexts) which can throw exceptions, they will be grouped into different errors.
					</div>
				</li>
				<li>
					<div class="subTitle">What kinds of notifications do you send?</div>
					<div class="a">
						When a new RuntimeException (such as NullPointerException or ClassCastException) or a breakpoint are hit for the first time, we will send you an email with the event summary - code location, previous methods and values of the variables triggering the event. We also send a daily digest email which reports how many errors happened across your servers today, highlighting errors that are new.
					</div>
				</li>
				<li>
					<div class="title" id="mailsettings">Mail settings</div>
					<div class="line">On top of showing your exceptions, Takipi can also notify via mail when new exceptions occur. The emails are divided into targeted alerts, which notify you when new exceptions are thrown in your code, and daily digests, which provide you a daily summary of the top exceptions, new exceptions and logged errors.</div><br/>
					<div class="line">You can choose if you want to receive notifications on all exceptions, or limit the emails to specific cases, e.g only uncaught exceptions. You can also manually set the amount of daily emails you want to receive (by default you will be notified on any new exception, up to 5 emails a day).</div>
					<div class="line">To change these settings, go to settings dialog in the Takipi app (top right hand side), and choose "email settings" from the drop-down menu.</div>
				</li>
				<!-- <li>
					<div class="subTitle">How do I set a breakpoint?</div>
					<div class="a">
						Simply click the gutter to the left of the source code line where you'd like to place it, just like you would in Eclipse or IntelliJ. If you want to place it in a different class click the "New Breakpoint" button in the Events panel. You can specify a condition for the breakpoint (e.g. "(state != null) || (list.size() &gt; 100))" in the Condition box. You can also specify the name of an object field you'd like Takipi to provide you with a history of its values when the breakpoint is hit by specifying the variable and field name (e.g. "this.active" or "ad.originURL").
					</div>
				</li>
				<li>
					<div class="subTitle">How do I remove a breakpoint?</div>
					<div class="a">
						You can either unfollow like you would any event or click on it in the source gutter and click "Remove".
					</div>
				</li>
				<li>
					<div class="subTitle">How can I tell if the same exception was recorded before and when?</div>
					<div class="a">
						Takipi measures the number of times an exception is thrown and periodically takes a "deep" sample of that event including live and historical variable values. When you open an event by clicking on it in the Events panel you can use the "Previous hits" selector to browse between the samples collected for it across multiple machines within that installation.
					</div>
				</li>
				<li>
					<div class="subTitle">Which calls do track for performance?</div>
					<div class="a">
						Takipi benchmarks all outgoing calls from your JVM to external DBs, OS and native library calls. This is regarldess of which framework or languuage you use. Takipi also benchmarks synchronized blocks and methods. If Takipi detects a noticeable slowdown in the call's performance, it will collect and display the variable data leading to that call.
					</div>
				</li> -->
			</ul>
			<ul category="troubleshooting" class="qna">
				<li>
					<div class="title">Troubleshooting</div>
					<div class="line">When setting up Takipi, an installation dialog will guide you through the installation and attachment process.</div>
					<div class="line">Here are the different messages that might be displayed in the dialog:</div>
				</li>
				<li>
					<div class="subTitle">No machines connected</div>
					<img src="assets/images/145_bigpanelNoMachines.png" class="imageborder" style="margin-left:-20px;" />
					<div class="line">This happens if Takipi is not running on your machine(s) or is unable to communicate with the Takipi service.</div>
					<div class="line">If you’ve installed Takipi and are still not seeing your machine connected, it might be a firewall / proxy issue.</div>
				</li>
				<li>
					For more installation dialog troubleshooting, <a href="javascript: void(0)" class="link dialog">click here</a>
				</li>
				<li>
					<div class="subTitle" topic="secretkey">I forgot/lost my secret key</div>
					<div class="line">Since your installation key is secret, it isn't stored by Takipi. However, you can still obtain your key through either of the following methods:</div>
					<ul class="internal decimal">
						<li>
							<div class="line">The key which was generated for you when you signed up was emailed to you from hello@takipi.com.</div>
						</li>
						<li>
							<div class="line">When you install Takipi on a machine, the key is stored in the secret.key file located in</div>
							<div class="line">- Windows: C:\Takipi\work\secret.key</div>
							<div class="line">- Mac: /Library/Takipi/work/secret.key</div>
							<div class="line">- Linux: /opt/takipi/work/secret.key</div>
						</li>
					</ul>
					<div class="line">You can always <a href="https://app.takipi.com/?nav=getkey" class="generate link" target="_blank">generate a new key</a>. However, data which was collected and encrypted using your previous key would no longer be available to you.</div>
				</li>
				<li>
					<div class="subTitle" topic="nodata">Restart the Takipi daemon</div>
					<div class="line">If you want to close or restart the Takipi daemon, do the following:</div>
					<div class="line">On <b>Windows</b> - Run <b>services.msc</b> and start/stop <b>TakipiService</b>.</div>
					<div class="line">On <b>Linux</b> - To stop it run:</div>
					<div class="code line">sudo service takipi stop</div>
					<div class="line">and to start it run:</div>
					<div class="code line">sudo service takipi start</div>
					<div class="line">On <b>Mac</b> - To stop it run:</div>
					<div class="code line">sudo launchctl unload /Library/LaunchDaemons/com.takipi.service.plist</div>
					<div class="line">and to start it run:</div>
					<div class="code line">sudo launchctl load /Library/LaunchDaemons/com.takipi.service.plist</div>
				</li>
				<li>
					<div class="subTitle">Disable automatic attach of Takipi agent</div>
					<div class="line">If you don't want Takipi to monitor new JVMs on your system, you need to disable the auto-attach mechanism:</div>
					<div class="line">- Linux: /opt/takipi/etc/takipi-disable-auto-attach</div>
				</li>
				<li>
					<div class="line">If you want Takipi to monitor any process starting on your machine, you'll need to <a href="javascript: void(0)" class="link connecting">manually attach it</a>.</div>
				</li>
			</ul>
			<ul category="dialog" class="qna">
				<li>
					<div class="title">Installation Dialog</div>
					<div class="line">When setting up Takipi, an installation dialog will guide you through the installation and attachment process.</div>
					<div class="line">Here are the different messages that might be displayed in the dialog:</div>
				</li>
				<li>
					<div class="subTitle">No machines connected</div>
					<img src="assets/images/145_bigpanelNoMachines.png" class="imageborder" style="margin-left:-20px;" />
					<div class="line">This happens if Takipi is not running on your machine(s) or is unable to communicate with the Takipi service.</div>
					<div class="line">If you’ve installed Takipi and are still not seeing your machine connected, it might be a firewall / proxy issue.</div>
				</li>
				<li>
					<div class="subTitle">No JVMs connected</div>
					<img src="assets/images/157_bigpanelStartRequired.png" class="imageborder" style="margin-left:-20px;" />
					<div class="line">This means Takipi is installed on your system, but hasn’t recognized any JVMs running.</div>
					<div class="line">If you haven’t started any JVMs for Takipi to monitor, this would be a good time to do so.</div>
				</li>
				<li>
					<div class="subTitle">Takipi not attached</div>
					<img src="assets/images/146_bigpanelNoAttach.png" class="imageborder" style="margin-left:-20px;" />
					<div class="line">This means Takipi was unable to connect to this Java process. This issue can easily be fixed by manually connecting Takipi to your processes.</div>
					<div class="line"><a href="javascript: void(0)" class="link connecting">Click here</a> to learn how.</div>
				</li>
				<li>
					<div class="subTitle">Initializing...</div>
					<img src="assets/images/149_bigpanelInitializing.png" class="imageborder" style="margin-left:-20px;" />
					<div class="line">This means Takipi was successfully attached to this JVMs, and will start to monitor it within a few minutes.</div>
				</li>
				<li>
					<div class="subTitle">No user code found</div>
					<img src="assets/images/150_bigpanelNoUserCode.png" class="imageborder" style="margin-left:-20px;" />
					<div class="line">Takipi automatically filters out standard 3rd party code (e.g. Apache Commons, Guava,..) to only show you errors originating from your own code or affecting it. This status means that no custom code has been loaded into that JVM so far.</div>
					<div class="line">Once Takipi finds your code, it will start monitoring the relevant JVM.</div>
				</li>
				<li>
					<div class="subTitle">Out of scope</div>
					<img src="assets/images/152_bigpanelOutOfScope.png" class="imageborder" style="margin-left:-20px;" />
					<div class="line">Some processes, such as IDEs (e.g. Eclipse, NetBeans) and build tools (e.g Maven) are not monitored by Takipi.</div>
					<div class="line">If you’re using one of these tools to start any JVMs you want Takipi to monitor, you can manually attach Takipi to these processes - <a href="javascript: void(0)" class="link connecting" topic="attachide">click here</a> to learn how.</div>
				</li>
				<li>
					<div class="subTitle">Incompatible JVM</div>
					<img src="assets/images/158_bigpanelIncompatible.png" class="imageborder" style="margin-left:-20px;" />
					<div class="line">Takipi only monitors Java processes running on the 64 bit HotSpot / OpenJDK JRE or JDK. Other virtual machines such as 32 bit JVMs, IBM J9 or the Apple Java plug-in are not supported.</div>
				</li>
			</ul>
			<ul category="anything" class="qna anything">
				<li>
					<div class="title">Couldn't find what you were looking for? We'd love to help!</div>
					<div class="line">
						Use the <a href="javascript: void(0)" id="showZopimBtn" class="link">live chat</a> or email us at: hello@takipi.com
					</div>
					<div class="arrow"></div>
				</li>
			</ul>
		</div>
	</div>
</div>
"""))}
  }

  def render(contentType:String,sep:Int,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(contentType,sep,content)

  def f:((String,Int,Html) => play.twirl.api.HtmlFormat.Appendable) = (contentType,sep,content) => apply(contentType,sep,content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:39 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/support/support.scala.html
                  HASH: 4de4ef12afd1bb22985c4002b8e5e7eef20a7b30
                  MATRIX: 524->1|657->46|684->47|7270->6604|7288->6611|7322->6622|7700->6971|7718->6978|7753->6990|10780->9988|10798->9995|10833->10007|12580->11725|12598->11732|12633->11744|18030->17114|18048->17121|18084->17134|18774->17796|18790->17802|18830->17820|35439->34400|35469->34401|35511->34414|35541->34415|35579->34424|35609->34425|35644->34431|35674->34432|41400->40129|41430->40130|41468->40139|41498->40140|42494->41107|42524->41108|42562->41117|42592->41118|44009->42506|44039->42507|44078->42517|44108->42518|44142->42523|44172->42524|44209->42532|44239->42533|44586->42851|44616->42852|44657->42865|44687->42866|45660->43810|45690->43811|45727->43819|45757->43820|47010->45044|47040->45045|47077->45053|47107->45054|48351->46269|48381->46270|48418->46278|48448->46279|49684->47486|49714->47487|49751->47495|49781->47496|69498->67183|69529->67184|69569->67194|69600->67195|69635->67200|69666->67201|69704->67209|69735->67210|70083->67528|70114->67529|70156->67542|70187->67543|71162->68488|71193->68489|71231->68497|71262->68498|72517->69723|72548->69724|72586->69732|72617->69733|73863->70949|73894->70950|73932->70958|73963->70959|75201->72167|75232->72168|75270->72176|75301->72177
                  LINES: 19->1|22->1|23->2|138->117|138->117|138->117|146->125|146->125|146->125|180->159|180->159|180->159|205->184|205->184|205->184|301->280|301->280|301->280|313->292|313->292|313->292|604->583|604->583|604->583|604->583|604->583|604->583|604->583|604->583|710->689|710->689|710->689|710->689|729->708|729->708|729->708|729->708|761->740|761->740|761->740|761->740|761->740|761->740|761->740|761->740|768->747|768->747|768->747|768->747|786->765|786->765|786->765|786->765|809->788|809->788|809->788|809->788|832->811|832->811|832->811|832->811|855->834|855->834|855->834|855->834|1230->1209|1230->1209|1230->1209|1230->1209|1230->1209|1230->1209|1230->1209|1230->1209|1237->1216|1237->1216|1237->1216|1237->1216|1255->1234|1255->1234|1255->1234|1255->1234|1278->1257|1278->1257|1278->1257|1278->1257|1301->1280|1301->1280|1301->1280|1301->1280|1324->1303|1324->1303|1324->1303|1324->1303
                  -- GENERATED --
              */
          