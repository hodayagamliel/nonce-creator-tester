
package views.html.pages

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
object features extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.1*/("""<div class="backgroundFiller"></div>
<div id="featuresMain" class="subPageMain">
	<div class="slimSiteCentered">
		<div class="heading">
			<h1>Features</h1>
			<div class="headerMiniSignup"></div>
		</div>
	</div>
	<div class="features-area">
		<div class="errors" id="errors">
			<div class="container">
				<header class="headline">
					<h2>Code breaks<br/>Get actionable insights once it happens</h2>
					<p>Takipi automatically detects 100% of errors in high-scale production code.</p>
				</header>
				<div class="errors-holder">
					<div class="errors-block">
						<div class="top">
							<h3>Errors</h3>
							<p>Instantly see all uncaught and caught exceptions,<br>log and HTTP errors anywhere in your application.</p>
						</div>
						<img class="img" src="assets/images/features/img-features-01.png" alt="image">
						<div class="bottom">
							<div class="holder">
								<h3>Slowdowns</h3>
								<p>See performance of all Java / Scala code.<br>No anotations or configuration needed.</p>
							</div>
						</div>
					</div><!-- / errors-block -->
				</div><!-- / errors-holder -->
			</div><!-- / container -->
		</div><!-- / errors -->
		<div class="colored detect" id="detect">
			<div class="container">
				<header class="headline">
					<h2>See which errors really impact your application</h2>
					<p>Takipi is built for environments where millions of errors happen every day.</p>
					<p>We'll tell you which ones really matter.</p>
				</header><!-- / headline -->
				<div class="holder">
					<img class="alignright" src="assets/images/features/img-features-02.png" alt="image">
					<div class="description">
						<p>Complete visibility to see which errors:</p>
						<ul class="list">
							<li class="ico ico-01">Come from code that was recently modified.</li>
							<li class="ico ico-02">Are new or increasing in rate.</li>
							<li class="ico ico-03">Keep happening even after marked as "resolved".</li>
						</ul>
					</div>
				</div><!-- / holder -->
				<div class="bubble bubble-1">
					<span class="tbl">
						<span class="tbl-cell"><span class="marked">Marked as resolved</span><br>3 days ago</span>
					</span>
				</div>
				<div class="bubble bubble-2">
					<span class="tbl">
						<span class="tbl-cell">Last 24 hr<span class="sep"><span class="up">270%</span></span></span>
					</span>
				</div>
			</div><!-- / container -->
		</div><!-- / detect -->
		<div class="fix" id="fix">
			<div class="container">
				<header class="headline">
					<h2>Here's the real magic:<br/>See what caused each bug. Fix it in minutes</h2>
					<p>Get immediate resolution by connecting developers with production errors.</p>
				</header><!-- / headline -->
				<div class="holder">
					<video width="665" height="296" class="alignright" poster="assets/images/features/rec1.gif" autoplay loop>
						<source src="assets/videos/features/vid-features-01.mp4" type="video/mp4">
					</video>
					<div class="description">
						<p>Alerting is not enough. Takipi provides DevOps and engineers the information they need to fix bugs. Get the source code and variable values behind each error - right as if you were there.</p>
						<ul class="list color-1">
							<li>See all the variables across the stack, without logging a single line.</li>
							<li>View the root cause in your code - even across machines.</li>
							<li>Access multiple reproductions for each error.</li>
							<li>Collaborate effortlessly between developers, DevOps and QA.</li>
						</ul>
					</div>
				</div><!-- / holder -->
			</div><!-- / container -->
		</div><!-- / fix -->
		<div class="analysis colored" id="analysis">
			<div class="container">
				<header class="headline">
					<h2>See which code slows down your application</h2>
					<p>Understand what causes slowdowns in production code.</p>
				</header><!-- / headline -->
				<div class="holder">
					<div class="block">
						<img class="alignright" src="assets/images/features/img-features-08.png" alt="image">
						<!-- <div class="slowdownRegistration">
							<p>Register for the Slowdown analysis Beta</p>
							<div class="analysis-form">
								<form action="#"><input class="txt" type="email" placeholder="Email Address"></form>
								<a href="javascript: void(0)" class="btn-submit">Join Beta</a>
							</div>
						</div>  -->
					</div>
					<div class="description">
						<ul class="list">
							<li>Automatically detect all slowdowns regardless of framework or architecture (no code changes).</li>
							<li>See the actual source code and variable values which caused each slowdown.</li>
							<li>See how 3rd party libraries (Hadoop, Spark, Akka) and your code perform together.</li>
						</ul>
					</div>
				</div><!-- / holder -->
			</div><!-- / container -->
		</div><!-- / analysis colored -->
		<div class="performance" id="performance">
			<div class="container">
				<header class="headline">
					<h2>Created for extreme performance restrictions<br/>Max 3% CPU</h2>
					<p>Takipi is built from the ground up to continuously run in high-scale environments.</p>
				</header><!-- / headline -->
				<div class="holder">
					<img class="alignright" src="assets/images/features/img-features-04.gif" alt="image">
					<div class="description">
						<ul class="list">
							<li>High-performance sampling tracks all errors in your application with low CPU and throughput overhead. Smart algorithms control when error data is collected.</li>
							<li>CPU overhead is throttled at 3%. Since data is only collected for errors, Takipi does not consume material network bandwidth or disk space.</li>
							<li>No overhead to the JVM heap or GC time.</li>
						</ul>
						<a class="more" href=""""),_display_(/*126.30*/globals/*126.37*/.TAKIPI_SUPPORT_SITE),format.raw/*126.57*/("""/performance-overhead/" target="_blank">Learn More</a>
					</div>
				</div><!-- / holder -->
			</div><!-- / container -->
		</div><!-- / configuration -->
		<div class="integrate colored" id="integrate">
			<div class="container">
				<header class="headline">
					<h2>Get new data from your log files<br/>Solve bugs much faster</h2>
					<p>Make your log files smarter. Empower your Jira and New Relic.</p>
				</header><!-- / headline -->
				<div class="holder">
					<div class="visual">
						<img class="img-01" src="assets/images/features/img-features-05.png" alt="image">
						<img class="img-02" src="assets/images/features/img-features-06.png" alt="image">
						<a class="link" href="#">Try<br>Me</a>
					</div>
					<div class="description">
						<div class="note">
							<p>One of Takipi's biggest time-savers is log integration.<br>Next to each error in your log you'll find a link to the<br>code and variables which caused it. This reduces the back and forth<br>between engineers and DevOps and time to resolution.<br>Zero configuration needed. Supports Logback, Log4j, SLF4J, and more.</p>
						</div>
						<ul class="logos">
							<li><a href="https://www.atlassian.com/software/jira" target="_blank"><img src="assets/images/features/ico-features-03.png" alt="image"></a></li>
							<li><a href="http://newrelic.com/plugins/takipi/156" target="_blank"><img src="assets/images/features/ico-features-04.png" alt="image"></a></li>
						</ul>
						<ul class="links">
							<li><a href=""""),_display_(/*152.22*/routes/*152.28*/.Application.logs),format.raw/*152.45*/("""" target="_blank">Takipi log links</a></li>
							<li><a href=""""),_display_(/*153.22*/routes/*153.28*/.Application.newrelicnew),format.raw/*153.52*/("""" target="_blank">Takipi for New Relic</a></li>
						</ul>
					</div>
				</div>
			</div><!-- / container -->
		</div><!-- / integrate -->
		<div class="security" id="security">
			<div class="container">
				<header class="headline">
					<h2>Industrial strength security</h2>
					<p>AES encryption protects all your data.</p>
				</header><!-- / headline -->
				<div class="holder">
					<img class="alignright" src="assets/images/features/img-features-07.png" alt="image">
					<div class="description">
						<ul class="list">
							<li>Code and data are encrypted on your server using a 256 bit AES cypher. Encryption keys are private to you, and are not stored by Takipi. Data collected can only be decrypted in your web browser using your private encryption key.</li>
							<li>Control which  team members are allowed to view each server's data and from which IP addresses they can access it.</li>
							<li>Regulate which variables are collected and encrypted to protect private data.</li>
						</ul>
						<ul class="links">
							<li><a class="more" href=""""),_display_(/*174.35*/globals/*174.42*/.TAKIPI_SUPPORT_SITE),format.raw/*174.62*/("""/security/" target="_blank">Learn More</a></li>
							<li><a class="download" href=""""),_display_(/*175.39*/globals/*175.46*/.SECURITY_WHITEPAPER),format.raw/*175.66*/("""" target="_blank">Download whitepapers</a></li>
						</ul>
					</div>
				</div><!-- / holder -->
			</div><!-- / container -->
		</div><!-- / security -->
		<div class="monitoring" id="ecosystem">
			<div class="container">
				<header class="headline">
					<h2>Your monitoring ecosystem just got better</h2>
					<p>Get more actionable data using your existing tool set</p>
				</header>
				<div class="monitoring-info">
					<div class="item item-1">
						<span class="tbl"><span class="tbl-cell">Takipi</span></span>
					</div>
					<div class="item item-2 type-2">
						<span class="tbl"><span class="tbl-cell">APM</span></span>
						<div class="pop-info">
							<h3>APM tools help you monitor issues.<br>Takipi lets you fix them in minutes.</h3>
							<p>With Takipi, your DevOps can communicate production problems to your dev team smoothly. Get actionable data on errors and slowdowns tracked by your APM. See the code, variable values and state behind server issues.</p>
						</div>
					</div>
					<div class="item item-3 type-2">
						<span class="tbl"><span class="tbl-cell">Log Management</span></span>
						<div class="pop-info">
							<h3>Your log files can get smarter. Takipi automatically links log entries to a full code analysis.</h3>
							<p>Cut down debugging time. Takipi attaches powerful links to errors and warnings in your logs. One click in your log management tool will show you exactly what led to each error.</p>
							<strong>Enrich your log files with new and powerful data:</strong>
							<ul class="list">
								<li>How many times has each error occurred?</li>
								<li>Which release did it start in?</li>
								<li>Is it coming from modified code?</li>
							</ul>
						</div>
					</div>
					<div class="item item-4 type-2 left">
						<span class="tbl"><span class="tbl-cell">Bug<br>Tracking</span></span>
						<div class="pop-info">
							<h3>Close tickets faster. Know when resolved errors rear their ugly heads again.</h3>
							<p>Add new data to bug tickets, and shrink the time it takes your developers to understand it. Takipi enriches bug tickets with a full 'replay' of what led to the error, including the entire stack, variable values and state. Takipi will help you reproduce the error, so you can solve it faster.<br>If an error that you've marked as 'Resolved' reappears, we will notify you right away. You will get a notification even if the code around the error has changed.</p>
						</div>
					</div>
					<div class="item item-5 type-3">
						<span class="tbl"><span class="tbl-cell"><img src="assets/images/features/img-features-17.png" alt="image description"></span></span>
						<div class="pop-info">
							<h3>Try Takipi's plug-in for New Relic.</h3>
							<strong>Get more data on errors within New Relic:</strong>
							<ul class="list">
								<li>Track more error types: caught exceptions, logged errors, and network errors.</li>
								<li>Get stats - Which errors are happening more than usual? Which errors stopped after your last deployment?</li>
								<li>See the entire stack and variable values which led to each error.</li>
							</ul>
							<a href=""""),_display_(/*228.18*/routes/*228.24*/.Application.newrelicnew),format.raw/*228.48*/("""" target="_blank">Learn more &gt;&gt;</a>
						</div>
					</div>
					<div class="item item-6 type-3">
						<span class="tbl"><span class="tbl-cell"><img src="assets/images/features/img-features-18.png" alt="image description"></span></span>
						<div class="pop-info">
							<h3>Get data on what caused production errors and solve errors much faster.</h3>
							<strong>Use Takipi to see the full picture:</strong>
							<ul class="list">
								<li>Variable values - As they were at each stage of the stack.</li>
								<li>Cross-machine analysis.</li>
								<li>Notifications on resolved errors that resurface.</li>
							</ul>
						</div>
					</div>
					<div class="item item-7 type-3 type-4">
						<span class="tbl"><span class="tbl-cell"><img src="assets/images/features/img-features-19.png" alt="image description"></span></span>
						<div class="pop-info">
							<h3>Your log files can get smarter.</h3>
							<strong>Enrich your log files with new and powerful data:</strong>
							<ul class="list">
								<li>How many times has each error occurred?</li>
								<li>Which release did it start in?</li>
								<li>Is it coming from modified code?</li>
							</ul>
						</div>
					</div>
					<div class="item item-8 type-3 type-4">
						<span class="tbl"><span class="tbl-cell"><img src="assets/images/features/img-features-20.png" alt="image description"></span></span>
						<div class="pop-info">
							<h3>Your log files can get smarter.</h3>
							<strong>Enrich your log files with new and powerful data:</strong>
							<ul class="list">
								<li>How many times has each error occurred?</li>
								<li>Which release did it start in?</li>
								<li>Is it coming from modified code?</li>
							</ul>
						</div>
					</div>
					<div class="item item-9 type-3 type-4">
						<span class="tbl"><span class="tbl-cell"><img src="assets/images/features/img-features-21.png" alt="image description"></span></span>
						<div class="pop-info">
							<h3>Your log files can get smarter.</h3>
							<strong>Enrich your log files with new and powerful data:</strong>
							<ul class="list">
								<li>How many times has each error occurred?</li>
								<li>Which release did it start in?</li>
								<li>Is it coming from modified code?</li>
							</ul>
						</div>
					</div>
					<div class="item item-10 type-3 type-4 left">
						<span class="tbl"><span class="tbl-cell"><img src="assets/images/features/img-features-22.png" alt="image description"></span></span>
						<div class="pop-info">
							<h3>Open JIRA issues directly from Takipi.</h3>
							<p>Use Takipi to track new errors and decide which ones to fix first. Stop wasting valuable time sifting through log files and trying to reproduce errors.<br>Use the 'Open Jira issue' button to open issues immediately. They will include all the code data which led to the error, enabling your dev team to cut down debugging time.</p>
						</div>
					</div>
					<div class="item item-11 type-3 type-4 left">
						<span class="tbl"><span class="tbl-cell"><img src="assets/images/features/img-features-23.png" alt="image description"></span></span>
						<div class="pop-info">
							<h3>Close tickets faster. Know when resolved errors rear their ugly heads again.</h3>
							<strong>Takipi adds new data to bug tickets, and shrinks the time it takes your developers to understand it.</strong>
							<ul class="list">
								<li>Get a full 'replay' of what led to the error, including the entire stack, variable values and state.</li>
								<li>Easily reproduce the error, so you can solve it faster.</li>
								<li>If an error marked as 'Resolved' reappears,  we will notify you immediately.</li>
							</ul>
						</div>
					</div>
					<div class="item item-12 type-3 type-4 left">
						<span class="tbl"><span class="tbl-cell"><img src="assets/images/features/img-features-24.png" alt="image description"></span></span>
						<div class="pop-info">
							<h3>Close tickets faster. Know when resolved errors rear their ugly heads again.</h3>
							<strong>Takipi adds new data to bug tickets, and shrinks the time it takes your developers to understand it.</strong>
							<ul class="list">
								<li>Get a full 'replay' of what led to the error, including the entire stack, variable values and state.</li>
								<li>Easily reproduce the error, so you can solve it faster.</li>
								<li>If an error marked as 'Resolved' reappears,  we will notify you immediately.</li>
							</ul>
						</div>
					</div>
					<div class="item item-13 type-5 left">
						<span class="tbl"><span class="tbl-cell">Third-Party<br>Java/Scala<br>Tools</span></span>
						<div class="pop-info">
							<h3>Know how third-party tools affect your code.</h3>
							<p>See whether or not your problems are caused by other libraries. Takipi helps you track errors, even outside your code.<br>Track the entire flow. Start at an exception or a slowdown within a third-party library and end in your code, even across different machines.</p>
						</div>
					</div>
					<div class="item item-14 type-6 left">
						<span class="tbl"><span class="tbl-cell"><img src="assets/images/features/img-features-25.png" alt="image description"></span></span>
						<div class="pop-info">
							<h3>Hadoop</h3>
							<p>Track errors coming from Hadoop and see your stack and variable values that led there. Get more visibility to Hadoop and know when code changes cause it to break or slow down. Takipi tracks Java, Pig and Hive code, and supports EMR.</p>
						</div>
					</div>
					<div class="item item-15 type-6 left">
						<span class="tbl"><span class="tbl-cell"><img src="assets/images/features/img-features-26.png" alt="image description"></span></span>
						<div class="pop-info">
							<h3>Spark</h3>
							<p>Track errors coming from Spark and see your stack and variable values that led there. Get more visibility to Spark and know when code changes cause it to break or slow down. Takipi tracks Java, Scala, Shark and Hive code.</p>
						</div>
					</div>
					<div class="item item-16 type-6 left">
						<span class="tbl"><span class="tbl-cell">Others</span></span>
						<div class="pop-info pop-info-2">
							<h3>Track errors from any third party library. Get error analysis and stats on errors coming from:</h3>
							<div class="cols">
								<div class="col">
									<ul class="list-info">
										<li>ElasticSearch</li>
										<li>Logstash</li>
										<li>Cassandra</li>
										<li>ActiveMQ</li>
										<li>CouchDB</li>
										<li>Lucene</li>
										<li>Solr</li>
										<li>Hazelcast</li>
									</ul>
								</div>
								<div class="col">
									<ul class="list-info">
										<li>Tomcat</li>
										<li>Glassfish</li>
										<li>JBoss / Wildfly</li>
									</ul>
									<ul class="list-info">
										<li>Spring</li>
										<li>Hibernate</li>
										<li>Guava</li>
										<li>AWS SDK</li>
									</ul>
								</div>
								<div class="col">
									<ul class="list-info">
										<li>Logback</li>
										<li>Log4j</li>
										<li>SLF4J</li>
									</ul>
								</div>
								<div class="col">
									<strong class="sub-str">Scala:</strong>
									<ul class="list-info">
										<li>Play framework</li>
										<li>Akka</li>
										<li>Lift</li>
										<li>Scalatra</li>
									</ul>
									<strong class="sub-str">Groovy:</strong>
									<ul class="list-info">
										<li>Grails</li>
									</ul>
								</div>
								<div class="col">
									<strong class="sub-str">Clojure:</strong>
									<ul class="list-info">
										<li>Luminus</li>
										<li>Noir</li>
										<li>Joodo</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div><!-- /monitoring -->
		<div class="up-running" id="signup">
			<div class="container">
				<header class="headline">
					<h2>Up and running in 5 minutes</h2>
					<p>Easy to try out. Simple to deploy.</p>
				</header>
				<ul class="feature-list">
					<li>Chef and Puppet automation.</li>
					<li>No need to add annotations, API calls or dependencies to your applications.</li>
					<li>Takipi runs at a JVM level and supports Java, Scala, Groovy and Clojure applications.</li>
				</ul>
			</div>
		</div><!-- / up-running -->
	</div><!-- / features-area -->
</div>
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Apr 15 17:20:38 IDT 2015
                  SOURCE: /Users/takipimbp1/temp-hod/site/app/views/pages/features.scala.html
                  HASH: a97e4b8ffb1e869b15b900fef7ef5d412f21089c
                  MATRIX: 589->0|6347->5730|6364->5737|6406->5757|7949->7272|7965->7278|8004->7295|8097->7360|8113->7366|8159->7390|9264->8467|9281->8474|9323->8494|9437->8580|9454->8587|9496->8607|12695->11778|12711->11784|12757->11808
                  LINES: 22->1|147->126|147->126|147->126|173->152|173->152|173->152|174->153|174->153|174->153|195->174|195->174|195->174|196->175|196->175|196->175|249->228|249->228|249->228
                  -- GENERATED --
              */
          