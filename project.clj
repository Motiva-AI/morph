(defproject ai.motiva/morph "1.3.0-SNAPSHOT"
  :description "A small collection of useful transformations"
  :url "http://github.com/Motiva-AI/morph"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[camel-snake-kebab "0.4.2"]
                 [com.rpl/specter "1.1.3"]
                 [clj-time "0.15.2"]]

  :repl-options {:init-ns user
                 :color   false}

  :eftest {:multithread?    false
           :capture-output? true
           :report          eftest.report.progress/report}

  :profiles {:dev {:source-paths   ["src"]
                   :test-paths     ["test"]

                   :dependencies [[org.clojure/clojure "1.10.3"]
                                  [circleci/bond "0.5.0"]
                                  [eftest "0.5.9"]
                                  [org.clojure/test.check "1.1.0"]
                                  [com.gfredericks/test.chuck "0.2.11"]
                                  [viebel/codox-klipse-theme "0.0.5"]]

                   :plugins [[test2junit "1.3.3"]
                             [lein-eftest "0.5.0"]
                             ;; for generating API docs
                             [lein-codox "0.10.3"]]

                   :codox {:metadata {:doc/format :markdown}}

                   :test2junit-output-dir "target/test2junit"
                   :test2junit-run-ant    true

                   :jvm-opts ["-XX:-OmitStackTraceInFastThrow"]}}

  :repositories [["releases" {:url           "https://clojars.org/repo"
                              :username      "motiva-ai"
                              :password      :env
                              :sign-releases false}]]

  :deploy-repositories [["releases" :clojars]])
