# ☕ JAVA ROADMAP — From Zero to Spring Boot Mastery

**Outcome:** Idiomatic Java, JVM expertise, production Spring Boot systems, and a portfolio demonstrating 2–3 years of backend experience.

**Total horizon:** 28 weeks (core 20 weeks + 8 weeks advanced/production).  
**Daily commitment:** 3–6 focused hours.  
**Mandatory:** daily code + `journal/DAY_xx.md` + git commit.

---

## Table of Contents

1. Phases & Weekly Plan
2. Phase Details (objectives, exercises, mini-projects, deliverables)
3. Repo Structure & Files
4. Checkpoints, Metrics & Quality Gates
5. Suggested Daily / Weekly Routine
6. Capstone Options
7. Quick Start Checklist

---

## 1 — Phases & Weekly Plan (at-a-glance)

| Phase | Weeks | Focus |
| ----- | ----- | ----- |
| 1 | 1–3 | Core Java syntax, types, control flow, arrays, strings, recursion |
| 2 | 4–5 | OOP, SOLID, design patterns, inner/anonymous classes |
| 3 | 6–7 | Collections, Generics, maps, sets, iterators, complexity |
| 4 | 8–9 | Concurrency & multithreading (basics → advanced) |
| 5 | 10–11 | Modern Java (Streams, Lambdas, Optional, Records, Modules) |
| 6 | 12 | I/O, NIO, serialization, JSON (Jackson/Gson) |
| 7 | 13 | JDBC, SQL, transactions, connection pooling |
| 8 | 14–15 | Spring Core: IoC, DI, MVC, AOP, validation |
| 9 | 16–18 | Spring Boot & Data JPA, Actuator, caching, migrations |
| 10 | 19 | Testing: JUnit5, Mockito, Testcontainers, integration testing |
| 11 | 20 | Build & CI: Maven/Gradle, Docker, CI pipeline |
| 12 | 21 | JVM internals: classloaders, GC, profiling, JFR |
| 13 | 22 | Reactive & messaging: Reactor, WebFlux, Kafka, gRPC |
| 14 | 23 | Security: Spring Security, OAuth2, JWT, input validation |
| 15 | 24 | Observability: logging, metrics, tracing, dashboards |
| 16 | 25–26 | Performance engineering: JMH, load testing, JVM tuning |
| 17 | 27–28 | Capstone: Microservices portfolio or Low-latency engine |

---

## 2 — Phase Details (objectives, exercises, deliverables)

### Phase 1 — Core Java Foundations (Weeks 1–3)

**Objectives** - Compile & run Java without IDE. Explain primitives vs references and stack vs heap.

**Topics**

- `javac/java`, packages, `main`
- Primitives, wrapper classes, casting
- Strings, `StringBuilder`, immutability
- Control flow: `if`, `switch` (expressions), loops
- Methods, varargs, overloading
- Arrays 1D/2D, basic sorting
- Recursion & simple backtracking

**Exercises**

- 100 problems: 50 easy, 40 medium, 10 recursion/backtracking.
- Examples: reverse string, rotate array, merge two sorted arrays, subset sum (small n).

**Mini-Project**

- CLI Contact Manager: add/list/search/delete, file persistence (CSV or JSON).

**Deliverables**

- `projects/phase1-cli-contact-manager/` with `README.md`, `src/`, `tests/`, `journal/`.

---

### Phase 2 — OOP & Design Patterns (Weeks 4–5)

**Objectives** - Apply SOLID and refactor procedural into OOP.

**Topics**

- Classes, constructors, `this`, immutability patterns
- Interfaces, abstract classes, default/static methods
- Inheritance vs composition, Liskov principle
- Inner classes & anonymous classes
- Patterns: Singleton, Factory, Strategy, Observer, DAO

**Exercises**

- 6 refactor tasks, 4 pattern implementations.

**Mini-Project**

- Banking or Inventory System with DAO layer and unit tests.

**Deliverables**

- `projects/phase2-banking-system/`, `architecture.md`, tests.

---

### Phase 3 — Collections & Generics (Weeks 6–7)

**Objectives**

- Choose correct collection; implement custom data structures as needed.

**Topics**

- `ArrayList`, `LinkedList`, `HashMap`, `TreeMap`, `HashSet`, `TreeSet`
- Iterators, `Comparable`, `Comparator`
- Generics: type bounds, wildcards (`? extends`, `? super`)
- Concurrent collections: `ConcurrentHashMap`, `CopyOnWriteArrayList`
- `Collections` utilities

**Exercises**

- Implement LRU cache (O(1)), comparator tasks, custom iterator.

**Mini-Project**

- Thread-safe in-memory cache (LRU + TTL)
**Deliverables**
- `projects/phase3-cache/`, README, tests, bench scripts.

---

### Phase 4 — Concurrency & Multithreading (Weeks 8–9)

**Objectives**

- Build thread-safe systems; explain Java Memory Model basics.

**Topics**

- `Thread`, `Runnable`, `Callable`, `Future`
- `synchronized`, `volatile`, `Lock`, `ReentrantLock`, `ReadWriteLock`, `StampedLock`
- Executors, thread pools, Fork/Join
- `CompletableFuture`, `CountDownLatch`, `CyclicBarrier`, `Phaser`
- Atomics, `LongAdder`, `ConcurrentHashMap` internals
- Deadlocks, race conditions, livelocks

**Exercises**

- Producer-consumer, deadlock creation/fix, parallel counters.

**Mini-Project**

- Multi-threaded log parser with concurrency-safe aggregation.
**Deliverables**
- `projects/phase4-log-processor/`, profiling notes, test harness.

---

### Phase 5 — Modern Java (Weeks 10–11)

**Objectives**

- Use Streams idiomatically; understand performance trade-offs.

**Topics**

- Lambdas, functional interfaces (Predicate/Consumer/Function/Supplier)
- Streams API: terminal vs intermediate ops, collectors, `flatMap`
- `Optional`, method references
- Java 9+ features: `var`, modules (intro), `HttpClient`
- Java 14+ features: Records, switch expressions, text blocks, sealed classes

**Exercises**

- Stream pipelines on large datasets, custom collector, Optional refactor.

**Mini-Project**

- Data transformation pipeline (CSV→transform→JSON) using Streams.
**Deliverables**
- `projects/phase5-data-pipeline/`, performance comparison report.

---

### Phase 6 — I/O, NIO & Serialization (Week 12)

**Objectives**

- Efficient large-file handling; safe serialization.

**Topics**

- `java.io` vs `java.nio` (Channels, Buffers), memory-mapped files
- `Files`, `Paths`, buffered streams
- Object Serialization pitfalls, custom `readObject/writeObject`
- Jackson streaming vs data-binding

**Exercises**

- Parse and process large (multi-GB) logs with `FileChannel`.

**Mini-Project**

- Log Analytics Tool (efficient reader + JSON extraction).
**Deliverables**
- `projects/phase6-log-analytics/`, bench results.

---

### Phase 7 — JDBC & SQL Integration (Week 13)

**Objectives**

- Use JDBC safely; design transactional boundaries and batch imports.

**Topics**

- JDBC API, `PreparedStatement`, `ResultSet`
- Transactions & isolation levels; rollback strategies
- Connection pooling (HikariCP), prepared-statement caching
- SQL indexing basics, explain plans

**Exercises**

- Batch import with transaction rollback simulation.

**Mini-Project**

- JDBC Task Manager with HikariCP and Flyway migrations.

**Deliverables**

- `projects/phase7-jdbc-task-manager/`, SQL scripts, migration files.

---

### Phase 8 — Spring Core (Weeks 14–15)

**Objectives**

- Build modular Spring apps; use DI & AOP for cross-cutting concerns.

**Topics**

- IoC & DI (constructor vs setter), bean scopes, lifecycle callbacks
- Spring MVC: `@Controller`, `@RestController`, request mapping
- Validation (JSR-303), global exception handling (`@ControllerAdvice`)
- AOP basics, profiles, externalized configs

**Exercises**

- Service layer unit tests with mocked repositories.

**Mini-Project**

- Spring MVC REST service with validation and centralized error handling.

**Deliverables**

- `projects/phase8-spring-core/`, `application.yml` samples, tests.

---

### Phase 9 — Spring Boot & Data JPA (Weeks 16–18)

**Objectives**

- Build deployable Spring Boot microservice with JPA and production features.

**Topics**

- Starters, auto-configuration, `application.yml`, profiles
- Spring Data JPA: entities, relationships, lazy loading, N+1
- Pagination, caching (Caffeine/Redis), caching strategies
- Actuator, health checks, metrics (Micrometer)
- Migrations (Flyway/Liquibase), Dockerization

**Milestone Project 1 — Product Catalog**

**Requirements**

- REST CRUD + search, PostgreSQL, JPA, DTO mapping, pagination, caching
- Actuator, health, metrics, Dockerfile, docker-compose
- CI: GitHub Actions building image + tests

**Deliverables**

- `projects/product-catalog/` (complete microservice), OpenAPI spec, integration tests, CI config.

---

### Phase 10 — Testing & CI (Week 19)

**Objectives**

- Reliable test strategy and reproducible CI.

**Topics**

- JUnit 5, Mockito, AssertJ
- Integration tests: `@SpringBootTest`, test slices
- Testcontainers (Postgres, Kafka), contract tests (Pact)
- Mutation testing (Pitest) overview

**Deliverables**

- CI pipeline config, test coverage report, reproducible test environment.

---

### Phase 11 — Containers & CI/CD (Week 20)

**Objectives**

- Containerize services and prepare for deployment.

**Topics**

- Docker multi-stage builds, image size optimization
- Docker Compose for local stacks
- Kubernetes basics: pods, deployments, services, configmaps, secrets
- Helm chart sketch (optional)

**Deliverables**

- `k8s/` manifests for product catalog, Dockerfiles, `deploy/` README.

---

### Phase 12 — JVM Internals & Profiling (Week 21)

**Objectives**

- Diagnose and tune application performance.

**Topics**

- Classloaders, bytecode basics, module path vs classpath
- JVM memory regions: heap (young/old), metaspace, stack
- GC algorithms: Serial, Parallel, CMS, G1, ZGC (concepts and flags)
- Tools: `jcmd`, `jstack`, `jmap`, Java Flight Recorder (JFR), JMC

**Exercises**

- Capture JFR for application under load and write findings.

**Deliverables**

- `notes/jvm-internals.md`, JFR export, analysis report.

---

### Phase 13 — Reactive & Messaging (Week 22)

**Objectives**

- Build a reactive pipeline; understand backpressure and when to use reactive.

**Topics**

- Reactive streams, Project Reactor (`Mono`, `Flux`)
- Spring WebFlux vs Web MVC
- Kafka fundamentals: producers, consumers, partitions, consumer groups
- gRPC + protobuf basics

**Mini-Project**

- Reactive ingestion → transform → Kafka sink + consumer aggregator.
**Deliverables**
- `projects/phase13-reactive/`, deployment notes, tests.

---

### Phase 14 — Security (Week 23)

**Objectives**

- Secure APIs with authN/authZ and best practices.

**Topics**

- Spring Security: filter chain, method security, roles
- JWT lifecycle (issue, verify, refresh), OAuth2 flows (Authorization Code)
- CSRF, CORS, secure headers, input validation strategies
- Secrets management overview (vaults, env vars)

**Deliverables**

- Secure configuration for product catalog, sample auth server or token demo.

---

### Phase 15 — Observability (Week 24)

**Objectives**

- Instrument services for logs, metrics, traces.

**Topics**

- Structured logging (JSON), correlation IDs, log levels
- Micrometer → Prometheus exposition, Grafana dashboards
- Distributed tracing: OpenTelemetry, span design, Zipkin
- Health, readiness probes, alerting basics

**Exercises**

- Create dashboard for p95/p99 latency and error rate.

**Deliverables**

- `observability/` dashboard screenshots, instrumentation snippets.

---

### Phase 16 — Performance Engineering (Weeks 25–26)

**Objectives**

- Quantify and reduce latency/allocations.

**Topics**

- JMH microbenchmarks, warmups, measurement methodology
- Load testing (k6/Gatling/jMeter); p50/p95/p99 analysis
- JVM flags for GC tuning, escape analysis, inlining effects
- DB tuning: indexing, slow query analysis, connection pool sizing

**Deliverables**

- JMH suite, load test reports, tuned JVM & app config with before/after metrics.

---

### Phase 17 — Capstone (Weeks 27–28)

Choose one:

**Option A — Microservices Portfolio**

- Product, Order, User services; event-driven integration; API gateway; tracing; CI/CD; k8s manifests.

**Option B — Low-latency Engine**

- In-memory order book, lock-free algorithms, low-latency optimizations, JMH & profiling.

**Deliverables**

- Production-ready repos, architecture docs, deployment manifests, monitoring dashboards, CI passing.

**Each project must include:**

- `README.md` (architecture, run instructions, acceptance criteria)
- `architecture.md` (sequence diagrams, data flow)
- `Dockerfile`, `docker-compose.yml` (if applicable)
- `k8s/` manifests (for deployable services)
- `ci/` or `.github/workflows/` (CI config)
- `tests/` and `bench/` directories

---

## 3 — Checkpoints, Metrics & Quality Gates

- **Daily:** commit `journal/DAY_xx.md` + code (min 30 LOC or one problem solved).
- **Weekly:** 1 PR merged to `main`, `WEEK_xx_REVIEW.md`.
- **Coverage:** Unit test coverage ≥ 75% per service; integration test pass in CI.
- **Performance:** Documented p95/p99 targets for services under load.
- **Delivery:** Each milestone project must have `run-local.sh` and Docker image build success.

---

## 4 — Suggested Daily / Weekly Routine

- **Daily (3–6h):**
  - 60–120m theory + reading
  - 90–180m coding & exercises
  - 15–30m journaling + commit
- **Weekly:**
  - One integration test / feature merge
  - Weekly review doc with blockers and plan
  - 1–2 hours of profiling/observability practice (after week 12)

---

## 5 — Interview & Exercise Checklist (select sample tasks)

- Implement thread-safe `LRUCache` with O(1) ops.
- Create `CompletableFuture` pipeline calling three services with timeouts and fallbacks.
- Explain GC selection for a low-latency service; show JVM flags.
- Design DB schema for orders + inventory, show SQL to avoid oversell.

---

## 6 — Quick Start Checklist

1. Create repo `java-roadmap` with structure above.
2. Add `journal/DAY_001.md` (start log) and commit.
3. Initialize `projects/phase1-cli-contact-manager` skeleton.
4. Schedule Phase 1 tasks for first 7 days.
5. Set CI to run unit tests on push to `main`.

---

## Acceptance Criteria (for each mini-project)

- README with architecture and run instructions
- Automated tests (unit + integration)
- Docker image builds and runs locally with `docker-compose`
- Health and metrics endpoints exposed
- One documented performance or profiling report
