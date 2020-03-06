--
-- PostgreSQL database dump
--

-- Dumped from database version 12.2
-- Dumped by pg_dump version 12.2

-- Started on 2020-03-06 22:11:53

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 203 (class 1259 OID 16402)
-- Name: items; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.items (
    item_id integer NOT NULL,
    item_name text NOT NULL,
    price integer NOT NULL
);


ALTER TABLE public.items OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 16394)
-- Name: players; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.players (
    char_id integer NOT NULL,
    name text NOT NULL,
    job_name text NOT NULL,
    hp integer NOT NULL,
    command text,
    level integer
);


ALTER TABLE public.players OWNER TO postgres;

--
-- TOC entry 2822 (class 0 OID 16402)
-- Dependencies: 203
-- Data for Name: items; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.items (item_id, item_name, price) FROM stdin;
1	ガリガリ君	1800
2	わんちゅーる	500
\.


--
-- TOC entry 2821 (class 0 OID 16394)
-- Dependencies: 202
-- Data for Name: players; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.players (char_id, name, job_name, hp, command, level) FROM stdin;
5	安寿	戦士	100	\N	1
1	ぶるる	戦士	100	\N	1
2	メイ	魔法使い	100	\N	2
3	ハル	武闘家	100	\N	3
4	華	魔法使い	100	\N	4
\.


--
-- TOC entry 2694 (class 2606 OID 16409)
-- Name: items items_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.items
    ADD CONSTRAINT items_pkey PRIMARY KEY (item_id);


--
-- TOC entry 2692 (class 2606 OID 16401)
-- Name: players party_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.players
    ADD CONSTRAINT party_pkey PRIMARY KEY (char_id);


-- Completed on 2020-03-06 22:11:53

--
-- PostgreSQL database dump complete
--

