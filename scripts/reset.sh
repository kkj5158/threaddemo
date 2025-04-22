#!/bin/bash
echo "!!! 개발 환경 초기화 중..."

docker-compose -f docker/compose/docker-compose-dev.yml down -v
docker-compose -f docker/compose/docker-compose-dev.yml up -d --build