(defproject metosin/porsas "0.0.1-alpha5"
  :description "Spike Lee for Fast DB-access with Clojure"
  :url "https://github.com/metosin/porsas"
  :deploy-repositories [["releases" :clojars]]
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo
            :comments "same as Clojure"}
  :scm {:name "git"
        :url "https://github.com/metosin/porsas"}
  :dependencies []
  :profiles {:dev {:global-vars {*warn-on-reflection* true}
                   :dependencies [[org.clojure/clojure "1.10.1-beta2"]
                                  [com.clojure-goes-fast/clj-async-profiler "0.3.1"]
                                  [com.h2database/h2 "1.4.199"]
                                  [seancorfield/next.jdbc "1.0.0-beta1"]
                                  [funcool/clojure.jdbc "0.9.0"]
                                  [org.clojure/java.jdbc "0.7.9"]
                                  [criterium "0.4.5"]]}
             :perf {:jvm-opts ^:replace ["-server"
                                         "-Xmx4096m"
                                         "-Dclojure.compiler.direct-linking=true"]}}
  :aliases {"all" ["with-profile" "dev"]
            "perf" ["with-profile" "default,dev,perf"]
            "test-clj" ["all" "do" ["test"] ["check"]]})